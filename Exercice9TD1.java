package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice9TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Donnez l'heure et la minute de depart");
		int Hd= sc.nextInt();
		int Md= sc.nextInt();
		System.out.println("Donnez l'heure et la minute d'arrive");
		int Ha= sc.nextInt();
		int Ma= sc.nextInt();
		int Dh=Ha-Hd;
		int Dm=Ma - Md;
		System.out.println("La duree du vol est :");
		System.out.println(Dh);
		System.out.println(" Heures");
		System.out.println(Dm);
		System.out.println(" minutes");

		
		
	}

}
