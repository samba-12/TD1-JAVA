package sn.exercices.TD1;

import java.util.Scanner;

public class Exercice21TD1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Donnez un nombre");
		int a= sc.nextInt();
		System.out.println(" Donnez un nombre");
		int ess= sc.nextInt();
		int nbretentatives=1;
		while(a!=ess) {
			if(a>ess) {
				System.out.println(" le nombre est plus grand ");	
				nbretentatives =nbretentatives+1;
				ess= sc.nextInt();

			}
			else if(a<ess) {
				System.out.println(" le nombre est plus petit ");	
				nbretentatives =nbretentatives+1;
				ess= sc.nextInt();
			}

		}
		System.out.print(" vou avez trouvé le nombre caché  en ");	
		System.out.print(nbretentatives);	
		System.out.println(" tentatives ");	



		
	}
}
