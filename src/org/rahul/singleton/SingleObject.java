package org.rahul.singleton;

public class SingleObject {
	
	private static SingleObject instance = null;
	public static SingleObject getInstance()
	{
		if (instance == null)
			instance = new SingleObject();
		
		return instance;
	}
	
	private SingleObject()
	{}
	
	public void showMessage()
	{
		System.out.println("hey, singleton design pattern here");
	}

}
