package com.control.statements;

public class ThreadClassMain extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name: " + this.getName() + ", isAlive: " + this.isAlive());
		SecondThreadMain secondT = new SecondThreadMain();
		secondT.setName("SecondThreadMain");
		secondT.start();
		try {
			System.out.println("about to join t1 to the end of secondT and thread name is: " + this.getName());
			secondT.join(); 
			System.out.println("After join call");
			for (int i = 0; i < 10; i++) {
				System.out.println("Run method of thread: " + this.getName() + ", with i: " + i);
				this.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadClassMain t1 = new ThreadClassMain();
		t1.setName("FirstThread");
		ThreadClassMain t2 = new ThreadClassMain();
		t2.setName("SecondThread");
		t1.run();
		Thread.sleep(500);
		t2.start();
		t1.join();
		t2.join();
		System.out.println("End of Main method");
	}

}
