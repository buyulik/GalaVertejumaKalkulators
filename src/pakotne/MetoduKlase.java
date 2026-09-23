package pakotne;

import java.util.Scanner;

public class MetoduKlase {
	// Audzēkņu skaita ievade un to atzīmes
	public static void ievaditStudentus(Scanner scan, String[] vardi, int[] majasdarbs, int[] pd, int[] eksamens, int studentuSk) {
		for (int i = 0; i < studentuSk; i++) {
			System.out.println("\nIevadi " + (i + 1) + ". studenta vārdu:");
			vardi[i] = scan.nextLine();
		}
	}
	static int ievaditAtzimi(Scanner scan, String zinojums) {
		int atzime;
		do {
				System.out.println(zinojums);
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