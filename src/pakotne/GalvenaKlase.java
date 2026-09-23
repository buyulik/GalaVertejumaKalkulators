package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GalvenaKlase {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		int maxStudenti = 30;
		String[] vardi = new String[maxStudenti];
		int[] majasdarbs = new int[maxStudenti];
		int[] pd = new int[maxStudenti];
		int[] eksamens = new int[maxStudenti];
		int[] svari = new int[3];
		int studSk = 0, kritSk;
		DecimalFormat df = new DecimalFormat("0.#");
		int izvele;
		do {
			System.out.println("\n--- IZVĒLNE ---");
			System.out.println("1 - Ievadīt audzēkņus");
			System.out.println("2 - Ievadīt kritērijus");
			System.out.println("3 - Ievadīt kritēriju svarus");
			System.out.println("5 - Ievadīt vērtējumus");
			System.out.println("6 - Labot kritēriju");
			System.out.println("7 - Labot kritēriju svaru");
			System.out.println("8 - Labot iegūto vērtējumu");
			System.out.println("9 - Aprēķināt gala vērtējumu");
			System.out.println("10 - Saglabāt rezultātus failā");
			System.out.println("11 - Nolasīt rezultātus no faila");
			System.out.println("12 - Beigt programmu");
			System.out.print("Izvēle: ");
			while (!scan.hasNextInt()) {
				System.out.print("Kļūda! Ievadi skaitli no 1 līdz 12: ");
				scan.next();
			}
			izvele = scan.nextInt();
			scan.nextLine();
			switch (izvele) {
			case 1:
				System.out.print("Cik studentus vēlies ievadīt? ");
				studSk = scan.nextInt();
				scan.nextLine();
				MetoduKlase.ievaditStudentus(scan, vardi, majasdarbs, pd, eksamens, studSk);break;
			case 2:
			case 3:
			case 4:
			case 5:MetoduKlase.ievaditAtzimi(scan, "Ievadiet atzīmi");break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:System.out.println("Programma darbu beidz.");break;
			default:System.out.println("Nepareiza izvēle!");
			}
		} while (izvele != 12);
		scan.close();
	}
}