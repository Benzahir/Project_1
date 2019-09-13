package aufgabe_1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "preDefinedRiskpolicy")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Riskpolicy {
	private List<PreDefinedProbability> preDefinedProbability;
	private List<PreDefinedSeverities> preDefinedSeverities;
    
    
    public Riskpolicy() {
		// TODO Auto-generated constructor stub
	}


	public Riskpolicy(List<aufgabe_1.PreDefinedProbability> preDefinedProbability,
			List<aufgabe_1.PreDefinedSeverities> preDefinedSeverities) {
		super();
		this.preDefinedProbability = preDefinedProbability;
		this.preDefinedSeverities = preDefinedSeverities;
	}


	public List<PreDefinedProbability> getPreDefinedProbability() {
		return preDefinedProbability;
	}


	public void setPreDefinedProbability(List<PreDefinedProbability> preDefinedProbability) {
		this.preDefinedProbability = preDefinedProbability;
	}


	public List<PreDefinedSeverities> getPreDefinedSeverities() {
		return preDefinedSeverities;
	}


	public void setPreDefinedSeverities(List<PreDefinedSeverities> preDefinedSeverities) {
		this.preDefinedSeverities = preDefinedSeverities;
	}


	@Override
	public String toString() {
		return "Riskpolicy [PreDefinedProbability=" + preDefinedProbability + ", preDefinedSeverities="
				+ preDefinedSeverities + "]";
	}

	

}
