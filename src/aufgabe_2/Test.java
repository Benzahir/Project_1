package aufgabe_2;

import java.util.Scanner;

import aufgabe_2.Aufgabe2;
import aufgabe_2.Kunde;

public class Test {

	public static void main(String[] args) {
		
		Aufgabe2 a = new Aufgabe2();
		a.display_menu();
				
		Scanner in = new Scanner(System.in);
		System.out.println("\n");
		
		boolean quit = false;
				
		do {
			switch (in.nextInt()) {			
			case 1:
				
				System.out.println("Name der Kunde : ");
				String name = in.next();
				a.addKunde(new Kunde(name));
				break;
			case 2:
				if(a.getList().isEmpty()) {
					System.out.println("Noch keine Kunden vorhanden");
				}
				else {
					for (Kunde kunde : a.getList()) {
						System.out.println(kunde.toString());
					}
				}			
				break;
			default:
				System.err.println("falsche Nummer !\nTschuss ! ");
				quit = true;				
				break;
			}
		} while(!quit);

	}

}
