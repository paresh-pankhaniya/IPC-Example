package com.java.example.IPC;
public class ThreadHandler  {
	public static void main(String str[]) {
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		
		Thread t11 = new Thread(t1);
		Thread t12 = new Thread(t2);
		
		t11.start();
		t12.start();
		try {
			t11.join();
			t12.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
