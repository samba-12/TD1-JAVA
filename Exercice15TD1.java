package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice15TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez un nombre");
		int nbre= sc.nextInt();
		int i;
		int som=0;
		int moy=0;
		for(i=1;i<=nbre;i++) {
			som = som + i;
			moy = som/nbre;

		}
		System.out.print(" La somme est ");
		System.out.print(som);
		System.out.print(" la moyenne est ");
		System.out.print(moy);

	
	}

}
