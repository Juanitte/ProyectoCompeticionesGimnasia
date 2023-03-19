package model;

import java.util.HashSet;
import java.util.Set;

import interfaces.iGroup;
import model.DTO.Gimnast;
import util.Utils;

public class Group implements iGroup {
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
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((gimnasts == null) ? 0 : gimnasts.hashCode());
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
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (gimnasts == null) {
			if (other.gimnasts != null)
				return false;
		} else if (!gimnasts.equals(other.gimnasts))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String toString() {
		return "Group [nombre=" + nombre + ", club=" + club + ", gimnasts=" + gimnasts + "]";
	}

	public boolean gimnastasCompatibles(Gimnast gimnast) {
		 for (Gimnast g : gimnasts) {
			  if(g.getCategory().equals(gimnast.getCategory())) {
				  Utils.showMessage("Es de la misma categoría.");
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
