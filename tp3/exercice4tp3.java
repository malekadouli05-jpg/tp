package tp3;
	import java.util.Scanner;
	public class exercice4tp3{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrez le nombre d'élèves : ");
	        int n = sc.nextInt();
	        double[] notes = new double[n];

	        double somme = 0;
	        double max = 0;
	        double min = 20; 
	        double moyenne;
	        for (int i = 0; i < n; i++) {
	            System.out.print("Entrez la note de l'élève " + (i + 1) + " (sur 20) : ");
	            notes[i] = sc.nextDouble();
	            somme += notes[i];
	            
	            if (notes[i] > max)
	                max = notes[i];

	            if (notes[i] < min)
	                min = notes[i];
	        }

	        moyenne = somme / n;
	        System.out.println("\n* Résultats *");
	        System.out.println("Somme des notes : " + somme);
	        System.out.println("Note maximale : " + max);
	        System.out.println("Note minimale : " + min);
	        System.out.println("Moyenne de la classe : " + moyenne);

	        sc.close();
	    }
	}
