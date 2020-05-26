package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice10TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez A");
		int A= sc.nextInt();
		System.out.println(" Donnez B");
		int B= sc.nextInt();
		System.out.println(" Donnez C");
		int C= sc.nextInt();
		if(A>B && B>C) {
			i=A;
			A=C;
			C=i;
			System.out.println(" L'ordre est");
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);

		}
		else if(C>B && B>A) {
			i=C;
			C=A;
			A=i;
			System.out.println(" L'ordre est");
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		}
		else if(C>A && A>B) {
			i=C;
			C=B;
			B=i;
			System.out.println(" L'ordre est");
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		}
		else if(A>C && C>B) {
			i=A;
			A=B;
			B=i;
			System.out.println(" L'ordre est");
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		}
		else if(B>C && C>A) {
			i=B;
			B=A;
			A=i;
			System.out.println(" L'ordre est");
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}
	}

}
