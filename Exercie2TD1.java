package sn.exercices.TD1;

import java.util.Scanner;

public class Exercie2TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println ("Veuillez saisir le rayon");
		int r = sc.nextInt();
		System.out.println ("le rayon est " + r);
		double perimetre= (double) (r*8*Math.atan(1));
		double surface =(double)(r*r*4*Math.atan(1));
		System.out.println ("le perimetre est "+perimetre+" la surface est "+surface);
		

	}

}
