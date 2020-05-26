package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice11TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez A");
		int A= sc.nextInt();
		System.out.println(" Donnez un operateur");
		String str = sc.next();
		char carac = str.charAt(0);
		System.out.println(" Donnez C");
		int C= sc.nextInt();
		int calcul=0;
		if (str.equals("+")) {
			calcul=A+C;		
			System.out.println(" La somme est "+calcul);
		}
		if (str.equals("-")) {
			calcul=A-C;		
			System.out.println(" La somme est "+calcul);
		}
		if (str.equals("*")) {
			calcul=A*C;		
			System.out.println(" La somme est "+calcul);
		}
		if (str.equals("/")) {
			calcul=A/C;		
			System.out.println(" La somme est "+calcul);
		}
		
		

	}

}
