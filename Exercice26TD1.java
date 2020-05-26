package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice26TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez un nombre");
		int nbre= sc.nextInt();
		int val, i, j;
		int tab []= new int [5];
		
		for(i=1;i<=nbre;i++) {
			System.out.println(" Donnez une valeur ");
			val = sc.nextInt();
		}
		for(i=1;i<=nbre;i++) {
			if(tab[i]>tab[i+1]) {
				System.out.println(" L'ordre est decroissant ");
			}
			else if (tab[i]<tab[i+1]) {
				System.out.println(" L'ordre est croissant ");

			}
		}
		
		
		
		
	}

}
