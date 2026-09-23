package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GalvenaKlase {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		String[] studenti =null;
		String[] kriteriji =null;
		int[] kriterijasSvars=null;
		int[] kriterijasVertejums=null;
		int[] semestraVertejums=null;
		int studSk = 0, kritSk=0;
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
				studenti=new String[studSk];
				scan.nextLine();
				MetoduKlase.ievaditStudentus(scan,studenti);break;
			case 2:
				if(studenti==null) {
					System.out.println("Vispirms ievadi audzēkņus");break;
				}
				System.out.print("Cik būs kritēriju?");kritSk=scan.nextInt();
				kriteriji=new String[kritSk];
				kriterijasSvars=new int[kritSk];
				MetoduKlase.ievaditKriterijus(scan,kriteriji);break;
			case 3:MetoduKlase.ievaditKriterijuSvarus(scan,kriteriji,kriterijasSvars);break;
			case 4:
			case 5:
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