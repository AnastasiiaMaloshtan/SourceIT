package lesson1_QuadraticEquation;

public class MainClass {

	public static void main(String[] args) {
		calculateRoots(2, 6, 2);
	}
    public static void calculateRoots(double a, double b, double c) {
    	double d = (b*b) - 4*a*c;
    	double x = -b / (2 * a);
    	double x1 = (-b + Math.sqrt(d))/(2*a);
    	double x2 = (-b - Math.sqrt(d))/(2*a);	
    	if (d>0)
    		System.out.println("The equation has two roots x1 = " + x1 + " x2 = " + x2);
    	if (d==0)
    		System.out.println("The equation has one root x = " + x); 
    	if (d<0)
    		System.out.println("No roots!"); 	
    }
  }  	