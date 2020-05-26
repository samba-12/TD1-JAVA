package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice12TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez un nombre");
		int n= sc.nextInt();
		int p=0;
		int i;
		for(i=1;i<=(n/2); i++) {
			if(n%i==0) {p=p+i;}	
		}
		if(n==p) {
			System.out.println(" Le nombre est parfait");
		}
		else {
			System.out.println("le nombre n'est pas parfait");
		}
		
	}

}
