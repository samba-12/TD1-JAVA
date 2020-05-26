package sn.exercices.TD1;
import java.util.Scanner;

public class Exercice6TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Donnez x1 pour le point A");
		Scanner sc = new Scanner (System.in);
		int x1= sc.nextInt();
		System.out.println(" Donnez y1 pour le point A");
		int y1= sc.nextInt();
		System.out.println(" Donnez x2 pour le point B");
		int x2= sc.nextInt();
		System.out.println(" Donnez y2 pour le point B");
		int y2= sc.nextInt();
		int distance = (int) Math.sqrt ((int)Math.pow((x1 - x2),2)  + (int)Math.pow((y1 - y2),2));
		System.out.println(" La distance est "+distance);


	}




}
