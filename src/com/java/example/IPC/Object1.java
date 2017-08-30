package com.java.example.IPC;


public class Object1 {
	private static int id;
	private static String name;
	
	private static Object1 obj1 = new Object1();
	private Object1() {
	}
	
	public static Object1 getObjInstance() {
			return obj1;
	}
	
	public void setId(int mId) {
		id = mId;
	}
	public int getId() {
		return id; 
	}
	
	public void setName(String mName) {
		name = mName;
	}
	
	public String getName() {
		return name;
	}
}
