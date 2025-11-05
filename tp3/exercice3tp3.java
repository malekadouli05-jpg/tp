package tp3;
	import java.util.Scanner;
	public class exercice3tp3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez un nombre n : ");
	        int n = sc.nextInt();

	        int[] tab = new int[n];

	        for (int i = 0; i < n; i++) {
	            int somme = 0;
	            for (int j = 0; j <= i; j++) {
	                somme += j;
	            }
	            tab[i] = somme;
	        }

	        System.out.println("\n* Contenu du tableau *");
	        for (int i = 0; i < n; i++) {
	            System.out.println("tab[" + i + "] = " + tab[i]);
	        }

	        sc.close();
	    }
	}

