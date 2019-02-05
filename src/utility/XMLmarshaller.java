package utility;


//La classe esegue il marshalling di un generico oggetto su un generico file xml
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLmarshaller 
{

	//packageName è il nome del package che contiene le classi di cui è stato effettuato il binding
	//object è l'oggetto di cui si vuole realizzare il marshalling
	//file name è il nome del file XML risultato del marshalling
	public static void marshal(String packageName, Object object, String fileName) throws JAXBException, IOException
	{
		JAXBContext context=JAXBContext.newInstance(packageName);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(object, new FileWriter(fileName));
	}
	
}
