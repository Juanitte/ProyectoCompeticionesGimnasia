package model;

import interfaces.iGroup;
import model.DTO.Gimnast;

public class Group implements iGroup {
	private String nombre;
	private String club;
	
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

	public boolean gimnastasCompatibles(Gimnast gimnast) {
		// TODO Auto-generated method stub
		return false;
	}

	public void modificarGrupo() {
		// TODO Auto-generated method stub
		
	}

	public boolean insertarGimnasta(Gimnast gimnast) {
		// TODO Auto-generated method stub
		return false;
	}

	public Gimnast borrarGimnasta(Gimnast gimnast) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
