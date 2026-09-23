package pakotne;

import java.util.Scanner;

public class MetoduKlase {
	// Audzēkņu skaita ievade un to atzīmes
	public static void ievaditStudentus(Scanner scan, String[] studenti) {
		scan.nextLine();
		for (int i = 0; i < studenti.length; i++) {
			System.out.println("\nIevadi " + (i + 1) + ". audzēkņa vārdu:");
			studenti[i] = scan.nextLine();
		}
	}
	//Vērtēšanas kritēriju skaita ievade
	public static void ievaditKriterijus(Scanner scan, String[] kriteriji) {
		scan.nextLine();
		for (int i = 0; i < kriteriji.length; i++) {
			do {
				System.out.println("\nIevadi " + (i + 1) + ". kriteriju:");
				kriteriji[i] = scan.nextLine().trim();
			}while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		}
	}
	public static void ievaditKriterijuSvarus(Scanner scan, String[] kriteriji, int[] kriterijasSvars) {
		int maxSvars=100,sk=1;
		double atlSvars;
		for (int i = 0; i < kriteriji.length; i++) {
		do {
			System.out.println("\nIevadi " + (i + 1) + ". kritērijas svaru(max:"+maxSvars+"):");
			while(!scan.hasNextInt()) {
				System.out.println("\nIevadi " + (i + 1) + ". kritērijas svaru:");
				scan.next();
			}
			kriterijasSvars[i]=scan.nextInt();
			atlSvars=(maxSvars-kriterijasSvars[i])/(double)(kriteriji.length-sk);
		}while(kriterijasSvars[i]>maxSvars || kriterijasSvars[i]<5 || 
				  (i != kriteriji.length-1 && kriterijasSvars[i] == maxSvars) ||
				  (i == kriteriji.length-1 && (maxSvars - kriterijasSvars[i])  > 0) 
				  || atlSvars < 5);
			maxSvars -= kriterijasSvars[i];
			sk++;
		}
		scan.nextLine();
	}
}