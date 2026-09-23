package pakotne;

import java.util.Scanner;

public class MetoduKlase {
	// Audzēkņu skaita ievade
	public static void ievaditStudentus(int studSk) {
		Scanner scan=new Scanner(System.in);
		int i;
		do {
			System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
			while(!scan.hasNextInt()) {
				System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
				scan.next();
			}
			studSk = scan.nextInt();
		}while(studSk<1);
		}
	}
