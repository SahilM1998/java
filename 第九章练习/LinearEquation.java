package ≥Ã–Ú«Âµ•9;

public class LinearEquation {
	private double a,b,c,d,e,f;
	
	LinearEquation(double newA,double newB,double newC,double newD,double newE,double newF){
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	public int notZero() {
		if(a*d-b*c==0) {
			return 0;
		}else {
			return 1;
		}
	}
}
