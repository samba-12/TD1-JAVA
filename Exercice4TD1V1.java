package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice4TD1V1 {

	public static void main(String[] args) {
		int x=0;
		int n= 0;
		int puissance=0;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez  la base X");
		x= sc.nextInt();
		System.out.println ("Veuillez saisir la puissance n");
		n=sc.nextInt();
		puissance =(int) Math.pow(x,n);
		System.out.println ("La puissance est "+ puissance);
		
		
	}

}
