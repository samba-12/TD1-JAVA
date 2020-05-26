package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice8TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int x1;
		int x2;
		int disc;
		System.out.println("Resolvons Ax2 + Bx + C = 0");
		Scanner sc = new Scanner(System.in);
		System.out.print("Donnez A : ");
		int A = sc.nextInt();
		System.out.print("Donnez B : ");
		int B = sc.nextInt();
		System.out.print("Donnez C : ");
		int C = sc.nextInt();
		disc = (B*B)-4*A*C;
		if(A==0 && B==0 && C==0) {
			System.out.println("tout reel est solution");
		}
		else if(A==0 && B==0) {
			System.out.println("Pas de solution");
		}
		else if(A==0) {
			x=-C/B;
			System.out.println("la solution est :"+x);
		}
		else if (disc<0) {
			System.out.println("Pas de solution le discriminant est negatif");
		}
		else {
			x1=(-B + (int)Math.sqrt(disc))/(2*A);
			x2=(-B - (int)Math.sqrt(disc))/(2*A);
			
			System.out.println("Les solutions sont : x1 = "+x1+ " et x2 = "+x2);

			
		}
	}

}
