package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//double xA,xB,xC,yA,yB,yC;
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entre com os valores dos lados do triangulo X");
		
		//xA =  sc.nextDouble();
		//xB =  sc.nextDouble();
		//xC =  sc.nextDouble();
		x.a =  sc.nextDouble();
		x.b =  sc.nextDouble();
		x.c =  sc.nextDouble();
		
		System.out.println("Entre com os valores dos lados do triangulo Y");
		
		//yA =  sc.nextDouble();
		//yB =  sc.nextDouble();
		//yC =  sc.nextDouble();
		y.a =  sc.nextDouble();
		y.b =  sc.nextDouble();
		y.c =  sc.nextDouble();
		
		//double p = (xA + xB + xC)/2.0;
		//double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		//double p = (x.a + x.b + x.c)/2.0;
		//double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		//p = (yA + yB + yC)/2.0;
		//double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		//p = (y.a + y.b + y.c)/2.0;
		//double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A area do triangulo X eh: %.4f%n",areaX);
		System.out.printf("A area do triangulo X eh: %.4f%n",areaY);
		
		if (areaX>areaY) {
			System.out.println("O triangulo X tem maior área");
		}else {
			System.out.println("O triangulo Y tem maior área");
		}

		
		sc.close();
	}

}
