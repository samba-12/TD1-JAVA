package sn.exercices.TD1;

public class Exercice23TD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbM=0;
		int nbm=0;
	int	i,n,c;
	for(i=0;i<=12;i++) {
		if(i==0) {
			nbm=2;
			nbM=0;
		}
		else {
			c=nbM;
			nbM= nbM+nbm;
			nbm=c;
			
		}
	}
	System.out.println(" le nombre de lapin est ");
	System.out.println(nbm+nbM);
		
	}

}
