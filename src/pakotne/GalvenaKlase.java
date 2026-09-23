package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GalvenaKlase {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		String[] studenti =null;
		String[] kriteriji =null;
		int[] kriterijasSvars=null;
		int[][] kriterijaVertejums=null;
		double[] semestraVertejums=null;
		int studSk = 0, kritSk=0;
		DecimalFormat df = new DecimalFormat("0.#");
		int izvele;
		do {
			System.out.println("\n--- IZVĒLNE ---");
			System.out.println("1 - Ievadīt audzēkņus");
			System.out.println("2 - Ievadīt kritērijus");
			System.out.println("3 - Ievadīt kritēriju svarus");
			System.out.println("4 - Ievadīt vērtējumus");
			System.out.println("5 - Labot kritēriju");
			System.out.println("6 - Labot kritēriju svaru");
			System.out.println("7 - Labot iegūto vērtējumu");
			System.out.println("8 - Aprēķināt gala vērtējumu");
			System.out.println("9 - Saglabāt rezultātus failā");
			System.out.println("10 - Nolasīt rezultātus no faila");
			System.out.println("11 - Beigt programmu");
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
				kriterijaVertejums=new int[studSk][kritSk];
				semestraVertejums=new double[studSk];
				MetoduKlase.ievaditKriterijus(scan,kriteriji);break;
			case 3:
				if(kriteriji==null) {
					System.out.println("Vispirms ievadi kriterijus");break;
				}
				MetoduKlase.ievaditKriterijuSvarus(scan,kriteriji,kriterijasSvars);break;
			case 4:
				if(kriterijasSvars==null) {
					System.out.println("Vispirms ievadi kriteriju svarus");break;
				}
				MetoduKlase.ievaditVertejumus(scan,studenti,kriteriji,kriterijaVertejums);break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:System.out.println("Programma darbu beidz.");break;
			default:System.out.println("Nepareiza izvēle!");
			}
		} while (izvele != 11);
		scan.close();
	}
}