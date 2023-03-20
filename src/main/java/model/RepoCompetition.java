package model;

import interfaces.iRepoCompetition;
import model.DTO.Gimnast;
import model.DTO.Type;
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

		private static RepoCompetition _newInstance;
		
		private RepoCompetition() {
			this.competitions = new HashSet<Competition>();
		}
		
		public static RepoCompetition getInstance() {
			if(_newInstance==null) {
				_newInstance = new RepoCompetition();
			}
			return _newInstance;
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

		public <T> boolean gimnastaParticipando(Gimnast gimnast) {
			for(Competition c : this.competitions) {
				for(Trial t : c.getTrials()) {
					for(Entry<T> entry : t.getParticipaciones())
						if(t.getTipo() == Type.INDIVIDUAL) {
							if(((Gimnast)entry.getParticipante()).equals(gimnast)) {
								return true;
							}
						}else {
							for(Gimnast g : ((Group)entry.getParticipante()).getGimnasts()) {
								if(g.equals(gimnast)) {
									return true;
								}
							}
						}
				}
			}
			return false;
		}
		
		

	}