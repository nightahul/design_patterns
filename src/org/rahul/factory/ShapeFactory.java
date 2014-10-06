package org.rahul.factory;

public class ShapeFactory {
	
	public Shape getShape(String shape)
	{
		if (shape == null)
			return null;
		if(shape.equalsIgnoreCase("circle"))
			return new Circle();
		if(shape.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(shape.equalsIgnoreCase("triangle"))
			return new Triangle();
		return null;
	}

}
