package ≥Ã–Ú«Âµ•11;

public class PolymorohismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFormSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	
	public static void displayObject(SimpleGeometricObject1 object) {
		System.out.println("Created on "+object.getDateCreated()+
				". Color is "+object.getColor());
	}
}
