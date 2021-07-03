import java.util.*;
import java.lang.Math;

class Calc{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("exp.....1\nlog.....2\ntrg.....3");
		int n = sc.nextInt();
		switch(n){

			case 1: 
				System.out.println("Enter x, then y;[pow(x,y)]");
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				System.out.println(x+"^"+y+"="+Math.pow(x,y));
			break;

			case 2:
				System.out.println("Enter log(z)");
				double z = sc.nextDouble();
				System.out.println("log("+z+")="+Math.log(z));
			break;

			case 3:
				System.out.println("Enter in degrees d:");
				double d = sc.nextDouble();
				double r = Math.toRadians(d);
				System.out.println(d+" degrees = "+r+" radians\n");
				System.out.println("sin("+d+") = " + Math.sin(r)+
								   "\ncos("+d+") = " + Math.cos(r)+
								   "\ntan("+d+") = " + Math.tan(r)+
								   "\nsec("+d+") = " + 1/Math.sin(r)+
								   "\ncosec("+d+") = " + 1/Math.cos(r)+
								   "\ncot("+d+") = " + 1/Math.tan(r) );
									
			break;

			default:
				System.out.println("default");
		}

	}
}