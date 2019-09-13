package aufgabe_2;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {
	
	private List<Kunde> list;

	public void display_menu() {
		System.out.println("---------------------------------------------------");
		System.out.println("Johaner Institut CRM");
		System.out.println("---------------------------------------------------");
		System.out.println("Bitte waehlen Sie eine der folgende Optionen\n");
		System.out.print("[1] Kunde erfassen\n");
		System.out.print("[2] Liste aller Kunde ausgeben");
	}

	public Aufgabe2() {
		list = new ArrayList<Kunde>();
	}
	
	public void addKunde(Kunde e) {
		list.add(e);
	}

	public List<Kunde> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "Aufgabe2 [list=" + list + "]";
	}

	

	

}
