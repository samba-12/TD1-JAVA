package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice19TD1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=1;;
		int som=0;
		while(a!=0) {
			System.out.println(" Donnez un nombre");
			a= sc.nextInt();
			som = som + a;
		}
		
		System.out.print(" La somme est : ");
		System.out.println(som);

	}

}
