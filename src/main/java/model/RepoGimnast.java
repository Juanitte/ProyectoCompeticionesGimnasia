package model;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import interfaces.iRepoGimnast;
import model.DTO.Category;
import model.DTO.Gimnast;
import util.Utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Gimnastas")
@XmlAccessorType(XmlAccessType.FIELD)
	public class RepoGimnast implements iRepoGimnast, Serializable {
		private Set<Gimnast> gimnasts;
		
		public RepoGimnast() {
			this.gimnasts = new HashSet<Gimnast>();
		}
		/**
		 *  nos dara la variable dni y cuando lo tengamos buscara ese dni y que no existen dos
			  return gimnast que hemos buscado
		 */
	public Gimnast buscarGimnastaPorDNI(String dni) {
		  for (Gimnast gimnast : gimnasts) {
		        if (gimnast.getDni().equals(dni)) {
		        	return gimnast;
		        }
		    }
		   return null;
		
	}
	/**
	 *  nos dara la variable del Nºtelefono y cuando lo tengamos buscara ese Nºtelefono y que no existen dos
	  return gimnast que hemos buscado
	 */
	public Gimnast buscarGimnastaPorTelefono(String phone) {
		   for (Gimnast gimnast : gimnasts) {
		        if (gimnast.getPhoneNumber().equals(phone)) {
		            return gimnast;
		        }
		    }
		    return null;
	}
	/**
	 *  nos dara la variable email y cuando lo tengamos buscara ese email y que no existen dos
	  return gimnast que hemos buscado
	 */

	public Gimnast buscarGimnastaPorEmail(String email) {
		for (Gimnast gimnast : gimnasts) {
	        if (gimnast.getEmail().equals(email)) {
	            return gimnast;
	        }
	    }
	    return null;
	}
	/**
	 * esta funcion nos permitira añadir un Gimnasta nuevo a nuestra base de datos 
	 * return un boolean para comprobar si lo ha metido o no en nuestra base de datos
	 */

	public boolean crearGimnasta(String dni, String name, String email, Category category, String club, String phone) {
		Gimnast nuevo =new Gimnast(dni, name, email, phone, category, club);
		if (gimnasts.add(nuevo)) {
			return true;
		}
		return false;
	}
	/**
	 * esta funcion mostrara todos los datos de todos nuestros gimnastas 
	 */
	public void mostrarGimnastas() {
		 for (Gimnast gimnast : gimnasts) {
			  Utils.showMessage(gimnast.toString() + "\n\t");	 
		   }
	}
	/**
	 * esta funcion nos permite poder modificar una gimnasta ya creado 
	 * la funcion nos pedira antes el gimnasta buscado para modificar
	 */
	public void modificarGimnasta(Gimnast gimnast, String dni, String name, String email, Category category, String club,String phone) {
		gimnast.setCategory(category);
		gimnast.setClub(club);
		gimnast.setDni(dni);
		gimnast.setEmail(email);
		gimnast.setName(name);
		gimnast.setPhoneNumber(phone);
		
	}
	/**
	 * esta funcion elimnina el Gimnasta que hemos buscado para borrarlo por completo en nuestra base de datos
	 */
	public boolean eliminarGimnasta(Gimnast gimnast) {
		  return gimnasts.remove(gimnast); // eliminamos el gimnasta del HashSet
		}
	
	
	public boolean agregarGimnasta(Gimnast gimnast) {
		return this.gimnasts.add(gimnast);
	}
	
	
	public boolean gimnastaDuplicado(Gimnast gimnast) {
		for(Gimnast gimnasta : this.gimnasts) {
			if(gimnasta.getDni().equalsIgnoreCase(gimnast.getDni())) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
