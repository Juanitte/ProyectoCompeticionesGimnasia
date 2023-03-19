package model;

import java.util.HashSet;
import java.util.Set;


import interfaces.iCompetition;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Type;
import util.Utils;

public class Competition implements iCompetition {
	private String nombre;
	private String description;
	private String fecha;
	private Set<Trial> trials;
	private int siguienteDorsal;

	public Competition() {
		super();
		this.nombre = "";
		this.description = "";
		this.fecha = "";
		this.trials = new HashSet<Trial>();
		this.siguienteDorsal = 0;
				
	}
	
	

	public Competition(String nombre, String description, String fecha, Set<Trial> trials, int siguienteDorsal) {
		super();
		this.nombre = nombre;
		this.description = description;
		this.fecha = fecha;
		this.trials = trials;
		this.siguienteDorsal = siguienteDorsal;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public Set<Trial> getTrials() {
		return trials;
	}



	public void setTrials(Set<Trial> trials) {
		this.trials = trials;
	}
	
	

	public int getSiguienteDorsal() {
		return siguienteDorsal;
	}



	public void setSiguienteDorsal(int siguienteDorsal) {
		this.siguienteDorsal = siguienteDorsal;
	}

	@Override
	public String toString() {
		return "Competición: \n\tNombre: " + nombre + "\n\tDescripción: " + description + "\n\tFecha: " + fecha;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		Competition other = (Competition) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	public void mostrarPruebas() {
		boolean valido=false;
		for(Trial prueba : trials) {
			Utils.showMessage(prueba.toString());
		}
		
	}
	
	public boolean pruebaDuplicada(Trial trial) {
		for(Trial prueba : trials) {
			if(trial.equals(prueba)) {
				return true;
			}
		}
		return false;
	}

	public Trial buscarPrueba( Type type, Category category, Gadget gadget) {
		for(Trial prueba : this.trials) {
			if(prueba.getTipo() == type && prueba.getCategoria() == category && prueba.getAparato() == gadget) {
			   Utils.showMessage(prueba.toString());
			   return prueba;
			}else {
			}
		}
		return null;
	}

	public boolean agregarPrueba(Trial trial) {
		return this.trials.add(trial);
	}
	
	public Group buscarGrupo(String name) {
		for(Trial prueba : this.trials) {
			if(prueba.getTipo() == Type.GRUPO){
			for(Entry<Group> participacion : prueba.getParticipaciones()) {
				if(((Group)participacion.getParticipante()).getNombre().equalsIgnoreCase(name)) {
					Utils.showMessage(((Group)participacion.getParticipante()).toString());
					return (Group)participacion.getParticipante();
				}else {
				}
			}
			}
		}
		return null;
	}



	public boolean nombreDeGrupoDuplicado(String nombre) {
		
		for(Trial trial : this.trials) {
			if(trial.getTipo() == Type.GRUPO) {
				for(Entry<Group> entry : trial.getParticipaciones()) {
					if(entry.getParticipante().getNombre().equalsIgnoreCase(nombre)) {
						return true;
					}
				}
			}
		}
		
		return false;
	}

	}
	
	
