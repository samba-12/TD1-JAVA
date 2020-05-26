package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice18TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez A");
		int a= sc.nextInt();
		System.out.println(" Donnez B");
		int b= sc.nextInt();
		int	c=a;
		int d=b;
		while(a!=b) {
		if(a>b) {
			b=b+d;
		}
		else if (a<b){
			a=a+c;
		}
		
		}	
		
		System.out.print(" Le PPCM est : ");
		System.out.println(a);

	}

}
