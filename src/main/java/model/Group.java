package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.iGroup;
import model.DTO.Gimnast;
import util.Utils;

@XmlRootElement(name="Grupo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group implements iGroup, Serializable {
	private String nombre;
	private String club;
	private Set<Gimnast> gimnasts;
	
	public Group() {
		this.nombre = "";
		this.club = "";
		this.gimnasts = new HashSet<Gimnast>();
	}
	
	public Group(String nombre, String club) {
		super();
		this.nombre = nombre;
		this.club = club;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public Set<Gimnast> getGimnasts() {
		return gimnasts;
	}

	public void setGimnasts(Set<Gimnast> gimnasts) {
		this.gimnasts = gimnasts;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String toString() {
		Iterator<Gimnast> it = this.gimnasts.iterator();
		String result = "Grupo: \n\tNombre: " + nombre + "\n\tClub: " + club + "\n\tGimnastas: ";
		while(it.hasNext()) {
			result += "\n\t";
			result += it.next().toString();
		}
		return result;
	}

	public boolean gimnastasCompatibles(Gimnast gimnast) {
		 for (Gimnast g : gimnasts) {
			  if(g.getCategory() == gimnast.getCategory() && g.getClub().equalsIgnoreCase(gimnast.getClub())) {
				  return true;
			  }
		   }
		 return false;
	}


	public void modificarGrupo() {
		setNombre(nombre);
		setClub(club);		
	}

	public boolean insertarGimnasta(Gimnast gimnast) {
        if (gimnastasCompatibles(gimnast)) {
            return gimnasts.add(gimnast);
        }
        return false;
    }

	public Gimnast borrarGimnasta(Gimnast gimnast) {
		gimnasts.remove(gimnast);
		return gimnast;
	}
	
	
}
