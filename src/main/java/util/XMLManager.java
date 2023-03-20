package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import interfaces.iRepoCompetition;
import interfaces.iRepoGimnast;
import model.RepoCompetition;
import model.RepoGimnast;




public class XMLManager {

	public static <T> boolean writeXML(T c, String fichero) {
		boolean result = false;
		
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(c.getClass());

			Marshaller m = context.createMarshaller();
			//Formatear XML
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.marshal(c, new FileOutputStream(fichero));
			result = true;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static iRepoCompetition readXMLC(String fichero) {
		iRepoCompetition result = new RepoCompetition();
		
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(result.getClass());

			Unmarshaller m = context.createUnmarshaller();
			result = (iRepoCompetition)m.unmarshal(new File(fichero));

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static iRepoGimnast readXMLG(String fichero) {
		iRepoGimnast result = new RepoGimnast();
		
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(result.getClass());

			Unmarshaller m = context.createUnmarshaller();
			result = (iRepoGimnast)m.unmarshal(new File(fichero));

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}