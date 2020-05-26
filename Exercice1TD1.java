package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice1TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b = 0;
		Scanner sc = new Scanner (System.in);
		try {
		System.out.println ("donner une valeur de  A");
		a = sc.nextInt();
		System.out.println ("donner une valeur de B");
		b = sc.nextInt();

		while (b==0) {
			System.out.println ("donner une valeur de b different de 0");
			 b = sc.nextInt();

		}
		
		int quotien = a/b;
		int reste =a%b;
		int ratio =(a/b)*100;
		System.out.println("le quotien est " +quotien+ " le reste est " +reste+" le ratio est "+ratio);
		} finally {
	        sc.close();
	    }
		
		
	}

}
