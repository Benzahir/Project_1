package aufgabe_1;

import java.io.File;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


public class Aufgabe1 {
	
public static void main(String[] args) {
		
		
		// replace the path with yours
		
		File file = new File("C:/Users/hp/eclipse-workspace/AufgabenJohnerInstitut/src/aufgabe_1/info.xml");
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(Riskpolicy.class);             
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Riskpolicy riskpolicy = (Riskpolicy) jaxbUnmarshaller.unmarshal(file);
		     
		    System.out.println(riskpolicy);
		}
		catch (JAXBException e)
		{
		    e.printStackTrace();
		}

	}


}
