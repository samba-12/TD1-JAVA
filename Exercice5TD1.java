package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice5TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int som=0;
		int i=1;
		for (i=1;i<=5;i++) {
			System.out.println("Donnez un nombre ");
			Scanner sc = new Scanner (System.in);
			int a= sc.nextInt();
			som=som+a;			
		}
		System.out.println(" La somme est "+som);
			
	}

}
