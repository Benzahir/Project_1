package aufgabe_1;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement(name = "preDefinedProbability")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class PreDefinedProbability {
	private List<Element> element;

	public PreDefinedProbability() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreDefinedProbability(List<aufgabe_1.Element> element) {
		super();
		this.element = element;
	}

	public List<Element> getElement() {
		return element;
	}

	public void setElement(List<Element> element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "preDefinedProbability [Element=" + element + "]";
	}


}
