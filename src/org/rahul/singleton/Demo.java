package org.rahul.singleton;

public class Demo {
	public static void main(String[] args)
	{
//		SingleObject obj = new SingleObject(); does not compile
		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
	}

}