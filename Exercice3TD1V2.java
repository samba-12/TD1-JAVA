package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice3TD1V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir r1");
		float r1 = sc.nextInt();
		System.out.println ("Veuillez saisir r2");
		float r2 = sc.nextInt();
		System.out.println ("Veuillez saisir r3");
		float r3 = sc.nextInt();
		System.out.println (" Faites votre choix 1 pour la resistance en serie et 2 pour la resistance en parallele");
		choix  = sc.nextInt();
		if (choix==1) {
			float rserie=r1+r2+r3;
			System.out.println("la resistance en serie est "+rserie);
		}
		else if (choix==2) {
			float rparal= (r1 * r2 * r3) / (r1*r2 + r2*r3 + r1*r3);
			System.out.println("la resistance en serie est "+rparal);
		}

	}

}
