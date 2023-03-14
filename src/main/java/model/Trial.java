package model;

import java.util.HashSet;
import java.util.Set;

import interfaces.iTrial;

public class Trial implements iTrial {
	private String nombre;
    private Set<Entry> participaciones;
    
	public Trial(String nombre, Set<Entry> participaciones) {
		super();
		this.nombre = nombre;
		this.participaciones = new HashSet<Entry>();
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
