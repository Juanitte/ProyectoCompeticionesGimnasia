package model;

import interfaces.iRepoCompetition;

import util.Utils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="Competiciones")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Competition.class})
	public class RepoCompetition implements iRepoCompetition, Serializable {
		private Set<Competition> competitions;

		
		public RepoCompetition() {
			this.competitions = new HashSet<Competition>();
		}
		public RepoCompetition(Set<Competition> competitions) {
			super();
			this.competitions = competitions;
		}
		

		public Set<Competition> getCompetitions() {
			return competitions;
		}


		public void setCompetitions(Set<Competition> competitions) {
			this.competitions = competitions;
		}


		public void mostrarCompeticiones() {
			for(Competition competition : competitions) {
			Utils.showMessage(competition.toString());
			}
		}

		public boolean competicionDuplicada(Competition competition) {
			
			for(Competition competitio : competitions) {
				if(competition.equals(competitio)) {
					return true;
				}
			}
			return false;
		
		}

		public Competition buscarCompeticionPorNombre(String name) {
			for (Competition competition : competitions) {
		        if (competition.getNombre().equalsIgnoreCase(name)) {
		        	return competition;
		        }
		    }
		   return null;
		}

		public Competition buscarCompeticionPorFecha(String fecha) {
			for (Competition competition : competitions) {
		        if (competition.getFecha().equalsIgnoreCase(fecha)) {
		        	return competition;
		        }
		    }
		   return null;
		}
		
		public boolean agregarCompeticion(Competition competition) {
			return this.competitions.add(competition);
		}
		
		

	}