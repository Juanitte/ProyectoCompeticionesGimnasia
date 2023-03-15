package model;

import java.util.HashSet;
import java.util.Set;

import interfaces.iTrial;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Type;

public class Trial implements iTrial {
	private String nombre;
    private Set<Entry> participaciones;
    private Type tipo;
    private Category categoria;
    private Gadget aparato;
    
    public Trial() {
    	this.nombre = "";
    	this.participaciones = new HashSet<Entry>();
    }
    
	public Trial(String nombre, Set<Entry> participaciones) {
		super();
		this.nombre = nombre;
		this.participaciones = participaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Entry> getParticipaciones() {
		return participaciones;
	}

	public void setParticipaciones(Set<Entry> participaciones) {
		this.participaciones = participaciones;
	}
	
	public Type getTipo() {
		return tipo;
	}

	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	public Gadget getAparato() {
		return aparato;
	}

	public void setAparato(Gadget aparato) {
		this.aparato = aparato;
	}

	public Trial modificarPrueba() {
		return null;
	}
    
    
    public Entry buscarParticipacion(int number) {
		return null;
    	
    }
    
    public Entry getWinner() {
		return null;
    	
    }
    
    public boolean insertarParticipacion(Entry entry) {
		return false;
    	
    }
    
    public void mostrarParticipaciones() {
    	
    }
    
    public boolean horaDuplicada(String hora) {
		return false;
    	
    }
	
}
