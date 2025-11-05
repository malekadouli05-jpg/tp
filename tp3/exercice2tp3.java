package tp3;
	import java.util.Scanner;
	public class exercice2tp3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] tab = {4, 7, 2, 7, 9, 5, 7};
	        System.out.print("Contenu du tableau : ");
	        for (int i = 0; i < tab.length; i++) {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	        System.out.print("Entrez un entier à rechercher : ");
	        int nombre = sc.nextInt();

	        int indiceTrouve = -1;
	        for (int i = 0; i < tab.length; i++) {
	            if (tab[i] == nombre) {
	                indiceTrouve = i;
	            }
	        }
	        if (indiceTrouve != -1) {
	            System.out.println("L'entier " + nombre + " appartient au tableau à l'indice " + indiceTrouve + ".");
	        } else {
	            System.out.println("L'entier " + nombre + " n'appartient pas au tableau.");
	        }

	        sc.close();
	    }
	}

	


