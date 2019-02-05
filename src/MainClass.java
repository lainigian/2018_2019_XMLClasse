import java.io.IOException;

import javax.xml.bind.JAXBException;

import classe.Classe;
import classe.TipoStudente;
import utility.XMLunmarshaller;

public class MainClass 
{

	public static void main(String[] args) throws JAXBException, IOException 
	{
		TipoStudente s1=new TipoStudente("22222", "Bartali", "Gino");
		TipoStudente s2=new TipoStudente("33333", "Binda", "Alfredo");
		TipoStudente s3=new TipoStudente("11111", "Bottecchia", "Luigi");
		
	/*	TipoClasse miaClasse=new TipoClasse(5,"B","INT");
		miaClasse.add(s1);
		miaClasse.add(s2);
		miaClasse.add(s3);
		
		XMLmarshaller.marshal("classe",miaClasse,"classe2.xml");
		System.out.println("ok");
		
	*/
		Classe miaClasse;
		miaClasse= (Classe) XMLunmarshaller.unmarshal("classe.xml", "classe");
		System.out.println(miaClasse.toString());

	}

}
