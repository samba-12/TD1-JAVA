package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice20TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int i=1;;
		int rang;
		int sup =a;
		for(rang=1; rang<=10;rang++) {
			System.out.println(" Donnez un nombre");
			a= sc.nextInt();
			if(a>sup) {
				sup=a;
				i=rang;
			}
		}
		System.out.println(" la plus grande valeur est ");
		System.out.println(sup);
		System.out.println(" Il occupe l'indice ");
		System.out.println(i);

		
		
		
		
	}

}
