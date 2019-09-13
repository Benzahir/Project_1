package aufgabe_1;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement(name = "element")
@XmlAccessorType(XmlAccessType.PROPERTY)



public class Element {
	private Long eId;
	private String eName;
	private Double eProbabilityFrom;
	private Double eProbabilityTo;
	
	
	public Element() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Element(Long id, String name, Double probabilityFrom, Double probabilityTo) {
		super();
		this.eId = id;
		this.eName = name;
		this.eProbabilityFrom = probabilityFrom;
		this.eProbabilityTo = probabilityTo;
	}

	public Long getId() {
		return eId;
	}

	public void setId(Long id) {
		this.eId = id;
	}

	public String getName() {
		return eName;
	}

	public void setName(String name) {
		this.eName = name;
	}

	public Double getProbabilityFrom() {
		return eProbabilityFrom;
	}

	public void setProbabilityFrom(Double probabilityFrom) {
		this.eProbabilityFrom = probabilityFrom;
	}

	public Double getProbabilityTo() {
		return eProbabilityTo;
	}

	public void setProbabilityTo(Double probabilityTo) {
		this.eProbabilityTo = probabilityTo;
	}

	@Override
	public String toString() {
		return "element [id=" + eId + ", name=" + eName + ", probabilityFrom=" + eProbabilityFrom + ", probabilityTo="
				+ eProbabilityTo + "]";
	}
	
	


}
