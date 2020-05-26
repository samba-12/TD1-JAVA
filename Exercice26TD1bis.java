package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice26TD1bis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int tab [] = null;
		int c=1;
		int d=1;
		int m= 1;
		for(i=1;i<=10;i++) {
			System.out.println(" Donnez une valeur ");
			tab[i] = sc.nextInt();
		}
	
		for(i=1;i<=10;i++) {
			if(tab[i]<tab[i+1]) {
				d=0;
				m=0;
			}
			else if(tab[i]>tab[i+1]){
				c=0;
				m=0;
			}
			else {
				d=0;
				c=0;
			}
		}
		if(c==1) {
			System.out.println(" L'ordre est croissant ");
		}
		else if(d==1) {
			System.out.println(" L'ordre est secroissant ");
		}
		else if(m==1) {
			System.out.println(" L'ordre est quelconque ");
		}
		else {
			System.out.println("ERREUR ");

		}
	}
}
