package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice3TD1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir r1");
		float r1 = sc.nextInt();
		System.out.println ("Veuillez saisir r2");
		float r2 = sc.nextInt();
		System.out.println ("Veuillez saisir r3");
		float r3 = sc.nextInt();
		float rserie=r1+r2+r3;
		float rparal= (r1 * r2 * r3) / (r1*r2 + r2*r3 + r1*r3);
		System.out.println("la resistance en serie est "+rserie+" et la resistance en parallele est "+rparal);
		
	}
}
