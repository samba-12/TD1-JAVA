package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice4TD1V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int n= 0;
		int puissance=1;
		int i =1;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez  la base X");
		x= sc.nextInt();
		System.out.println ("Veuillez saisir la puissance n");
		n=sc.nextInt();
		for(i=1; i<=n;i++) {
			puissance = puissance*x;

		}
		System.out.println ("La puissance est "+ puissance);

		
	}

}
