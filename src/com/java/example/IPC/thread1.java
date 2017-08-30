package com.java.example.IPC;
import java.util.Scanner;

public class thread1 implements Runnable{
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		Object1 obj1 = Object1.getObjInstance();
		
		synchronized (obj1) {
			while(obj1.getName() != null) {
				try {
					obj1.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
				System.out.println("producing");
				obj1.setId(Integer.parseInt(sc.next()));
				obj1.setName((sc.next())); 
				obj1.notify();
			
		}		
	}

}
