package tp3;

	import java.util.Arrays;
	import java.util.Scanner;
	public class exercice1tp3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] tableau = new int[5];
	        System.out.println(" *Remplir le tableau *");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print("Entrez la valeur " + (i + 1) + " : ");
	            tableau[i] = sc.nextInt();
	        }
	        System.out.println("\n* Contenu du tableau*");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print(tableau[i] + " ");
	        }
	        Arrays.sort(tableau);

	        System.out.println("\n\n* Tableau trié (ordre croissant) *");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print(tableau[i] + " ");
	        }

	        sc.close();
	    }
	}

