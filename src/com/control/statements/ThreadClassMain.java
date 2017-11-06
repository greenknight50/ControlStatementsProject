package com.control.statements;

public class ThreadClassMain extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name: " + this.getName() + ", isAlive: " + this.isAlive());
		for (int i = 0; i < 2000; i++) {
			System.out.println("Run method of thread: " + this.getName() + ", with i: " + i);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadClassMain t1 = new ThreadClassMain();
		t1.setName("FirstThread");
		t1.setPriority(Thread.MAX_PRIORITY);
		ThreadClassMain t2 = new ThreadClassMain();
		t2.setName("SecondThread");
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("FirstThread priority: " + t1.getPriority());
		System.out.println("SecondThread priority: " + t2.getPriority());
		t2.start();
		t1.start();
		t1.yield();
		System.out.println("End of Main method");
	}
}
