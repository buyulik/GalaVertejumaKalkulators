package pakotne;

import java.util.Scanner;

public class MetoduKlase {
	// Audzēkņu skaita ievade un to atzīmes
	public static void ievaditStudentus(Scanner scan, String[] vardi, int[] majasdarbs, int[] pd, int[] eksamens, int studentuSkaits) {
		for (int i = 0; i < studentuSkaits; i++) {
			System.out.println("\nIevadi " + (i + 1) + ". studenta vārdu:");
			vardi[i] = scan.nextLine();
			majasdarbs[i] = ievaditAtzimi(scan, "Mājasdarba atzīme: ");
			pd[i] = ievaditAtzimi(scan, "Pārbaudes darba atzīme: ");
			eksamens[i] = ievaditAtzimi(scan, "Eksāmena atzīme: ");
		}
	}
	static int ievaditAtzimi(Scanner scan, String zinojums) {
		int atzime;
		do {
			System.out.print(zinojums);
			while (!scan.hasNextInt()) {
				System.out.print("Ievadi skaitli (1-10): ");
				scan.next();
			}
			atzime = scan.nextInt();
			scan.nextLine();
		} while (atzime < 1 || atzime > 10);
		return atzime;
	}
		}