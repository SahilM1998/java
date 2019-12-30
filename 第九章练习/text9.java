package ≥Ã–Ú«Âµ•9;

public class text9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon one = new RegularPolygon();
		RegularPolygon two = new RegularPolygon(6,4);
		RegularPolygon three = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("the first example: "+one.getPerimeter()+
				" the area is "+one.getArea());
		System.out.println("the second example: "+two.getPerimeter()+
				" the area is "+two.getArea());
		System.out.println("the third example: "+three.getPerimeter()+
				" the area is "+three.getArea());
	}

}
