package com.control.statements;

public class SecondThreadMain extends Thread {

	@Override
	public void run() {
		for (int i = 100; i < 110; i++) {
			System.out.println("ThreadName: " + this.getName() + ", i: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
