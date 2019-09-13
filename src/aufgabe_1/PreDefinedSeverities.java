package aufgabe_1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "preDefinedSeverities")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class PreDefinedSeverities {

	private List<String> element;

	public PreDefinedSeverities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreDefinedSeverities(List<String> element) {
		super();
		this.element = element;
	}

	public List<String> getElement() {
		return element;
	}

	public void setElement(List<String> element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "preDefinedSeverities [element=" + element + "]";
	}

	
}
