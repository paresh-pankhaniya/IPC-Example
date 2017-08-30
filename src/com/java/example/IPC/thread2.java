package com.java.example.IPC;

public class thread2 implements Runnable{
	
	
	public void run() {
		Object1 obj1 = Object1.getObjInstance();
		synchronized (obj1) {
			while(obj1.getName() == null) {
				try {
					obj1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
				System.out.println("consuming");
				System.out.println("consuming "+obj1.getId());
				System.out.println("consuming "+obj1.getName());
				obj1.notify();
			
		}	
		
	}
}
