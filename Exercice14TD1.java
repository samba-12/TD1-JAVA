package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice14TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez un Jour");
		int j= sc.nextInt();
		System.out.println(" Donnez un mois");
		int m= sc.nextInt();
		System.out.println(" Donnez une annee");
		int a= sc.nextInt();
		if(a%4==0 && a%100==0 && a%400==0) {
			System.out.println("L'annee est bisextile");

		}
		else {
			System.out.println("L'annee n'est pas bisextile");

		}
	}

}
