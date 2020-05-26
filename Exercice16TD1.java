package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice16TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez A");
		int a= sc.nextInt();
		System.out.println(" Donnez B");
		int b= sc.nextInt();
		int q=0;
		while(a>=b) {
			a=a-b;
			q=q+1;
		}
		System.out.print(" La division est : ");
		System.out.print(q);

	}

}
