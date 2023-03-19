package model;

import java.util.HashSet;
import java.util.Set;

import interfaces.iTrial;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Type;
import util.Utils;

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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparato == null) ? 0 : aparato.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Trial other = (Trial) obj;
		if (aparato != other.aparato)
			return false;
		if (categoria != other.categoria)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public String toString() {
		return "Prueba:\n\tNombre: " + this.nombre + "\n\tTipo: " + this.tipo.toString() + "\n\tCategoría: "
				+ this.categoria.toString() + "\n\tAparato:" + this.aparato.toString();
	}
    
    
    public <T> Entry<T> buscarParticipacion(int number) {
		for (Entry<T> entry : participaciones) {
			if (entry.getNumber() == number) {
				Utils.showMessage(entry.toString());
				return entry;
			}
		}
		return null;
	}
    
    public <T> Entry<T> getWinner() {
		Entry<T> winner = null;
		for (Entry<T> entry : participaciones) {
			if (winner == null || winner.getPoints() < entry.getPoints()) {
				winner = entry;
			}
		}
		return winner;
	}
    
    public <T> boolean insertarParticipacion(Entry<T> entry) {
		if (!horaDuplicada(entry)) {
			return participaciones.add(entry);
		}
		return false;
	}
    
    public <T> void mostrarParticipaciones() {
		Utils.showMessage("Lista de participaciones:");
		for (Entry<T> participacion : participaciones) {
			Utils.showMessage(participacion.toString());
		}
	}
    
    public <T> boolean horaDuplicada(Entry<T> participante) {
		for (Entry<T> e : participaciones) {
			if (e.getTime().equalsIgnoreCase(participante.getTime())) {
				return true;
			}
		}
		return false;
	}
    
	
}
