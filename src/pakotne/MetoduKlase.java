package pakotne;

import java.text.DecimalFormat;
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
	//Norāda vērtējumu kādu ieguvis katrs audzēknis par katru kritēriju
	public static void ievaditVertejumus (Scanner scan,String[] studenti, String[] kriteriji, int[][] kriterijaVertejums) {
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < kriteriji.length; j++) {
			do {
				System.out.println("\nIevadi " +studenti[i]+ " vertejumu par kritēriju "+ kriteriji[i]+" (1-10):");
				while(!scan.hasNextInt()) {
					System.out.println("\nIevadi " +studenti[i]+ " vertejumu par kritēriju "+ kriteriji[i]+":");
					scan.next();
				}
				kriterijaVertejums[i][j]=scan.nextInt();
			}while(kriterijaVertejums[i][j]<1||kriterijaVertejums[i][j]>10);
		}
	}
		scan.nextLine();
	}
	// Gala vērtējuma aprēķināšana
	public static void aprekinatGalaVertejumu (String[] studenti, String[] kriteriji, int[][] kriterijaVertejums,double[] semestraVertejums, DecimalFormat df) {
		double rezultats;
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < kriteriji.length; j++) {
			rezultats+=((double)kriterijasSvars[j]/100)*kriterijaVertejums[i][j];
		}
			semestraVertejums[i]=rezultats;
	}
		System.out.println("/n--- GALA VĒRTĒJUMI ---");
		for (int i = 0; i < studenti.length; i++) {
			for (int j = 0; j < kriteriji.length; j++) {
		System.out.println("\nStudenta " +studenti[i]+ " vertejumu par kritēriju "+ kriteriji[i]+" ir "+kriterijaVertejums[i][j]);
			}
			System.out.println("Semestra vērtējums ir "+df.format(semestraVertejums[i])+" balles");
		}
	}
	public static void labotKriterijuSvaru(Scanner scan, String[] studenti,String[] kriteriji, int[][] kriterijaVertejums) {
		System.out.println("Kritēriju labošana");
		System.out.println("Jāievada visi svari no jauna!");
		ievaditKriterijuSvarus(scan,kriteriji,kriterijaVertejums);
	}
	}