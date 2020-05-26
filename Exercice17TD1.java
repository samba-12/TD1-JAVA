package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice17TD1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez A");
		int a= sc.nextInt();
		System.out.println(" Donnez B");
		int b= sc.nextInt();
		while(a>b) {
			a=a-b;
		if(a==b) {
			System.out.print(" le pgcd est : ");
			System.out.println(a);
		}
		}
		while(a<b) {
			b=b-a;
			if(a==b) {
				System.out.print(" le pgcd est : ");
				System.out.println(a);
			}
			
		}	
		
		
	}

}
