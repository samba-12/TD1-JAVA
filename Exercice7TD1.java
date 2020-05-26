package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice7TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b20,b10,b5,p2,p1,reste;
		System.out.println("Donnez un montant en Euro");
		Scanner sc = new Scanner (System.in);
		int montant = sc.nextInt();
		b20=Math.floorDiv(montant, 20);
		reste = Math.floorMod(montant,20);
		b10=Math.floorDiv(reste,10);
		reste = Math.floorMod(reste,10);
		b5=Math.floorDiv(reste,5);
		reste=Math.floorMod(reste, 5);
		p2=Math.floorDiv(reste,2);
		reste=Math.floorMod(reste, 2);
		p1=Math.floorDiv(reste,1);
		System.out.println("Dans "+montant+ " Euros il y'a : ");
		System.out.println(b20+" billets de 20 euros");
		System.out.println(b10+" billets de 10 euros");
		System.out.println(b5+" billets de 5 euros");
		System.out.println(p2+" pieces de 2 euros");
		System.out.println(p1+" pieces de 1 euro");

		

		


		

	}

}
