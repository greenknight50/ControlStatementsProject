package com.java.control.statements;

public class DeadLockThreadMain {

	public static void main(String[] args) throws InterruptedException {
		String resourceData = "Important text";
		String secondResource = "Very important text";

		Thread thread1 = new Thread() {
			public void run() {
				synchronized (resourceData) {
					System.out.println("Thread name: " + this.getName() + ", Locked resourceData");
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (secondResource) {
						System.out.println("Thread name: " + this.getName() + ", Locked secondResource");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				synchronized (secondResource) {
					System.out.println("Thread name: " + this.getName() + ", Locked secondResource");
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resourceData) {
						System.out.println("Thread name: " + this.getName() + ", Locked resourceData");
					}
				}
			}
		};

		thread1.setName("FirstThread");
		thread2.setName("SecondThread");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("About to exit main method");
	}

}
