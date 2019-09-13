package aufgabe_2;

public class Kunde {
	
	private String name;

	public Kunde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kunde(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kunde [name=" + name + "]";
	}
	
	

}
