package model;

import java.util.HashSet;
import java.util.Set;

import interfaces.iRepoGimnast;
import model.DTO.Category;
import model.DTO.Gimnast;
import util.Utils;

public class RepoGimnast implements iRepoGimnast {
	public class RepoGimnast implements iRepoGimnast {
		private Set<Gimnast> gimnasts;
		Utils util = new Utils();
		public RepoGimnast() {
			this.gimnasts = new HashSet<>();
		}
		/**
		 *  nos dara la variable dni y cuando lo tengamos buscara ese dni y que no existen dos
			  return gimnast que hemos buscado
		 */
	public Gimnast buscarGimnastaPorDNI(String dni) {
		  for (Gimnast gimnast : gimnasts) {
		        if (gimnast.getDNI().equals(dni)) {
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
		Gimnast nuevo =new Gimnast(dni, name, email, phone, category, club,  phone);
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
			  System.out.println(gimnast);	 
		   }
	}
	/**
	 * esta funcion nos permite poder modificar una gimnasta ya creado 
	 * la funcion nos pedira antes el gimnasta buscado para modificar
	 */
	public void modificarGimnasta(String dni, String name, String email, Category category, String club,String phone) {
		gimnast.setCategory(category);
		gimnast.setClub(club);
		gimnast.setDNI(dni);
		gimnast.setEmail(email);
		gimnast.setName(name);
		gimnast.setPhoneNumber(phone);
		
	}
	/**
	 * esta funcion elimnina el Gimnasta que hemos buscado para borrarlo por completo en nuestra base de datos
	 */
	public Gimnast eliminarGimnasta(Gimnast gimnast) {
		  gimnasts.remove(gimnasts); // eliminamos el gimnasta del HashMap
			return gimnast;
		}
	
	
	

}
