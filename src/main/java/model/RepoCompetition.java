package model;

import interfaces.iRepoCompetition;

import util.Utils;

import java.util.HashSet;
import java.util.Set;

	public class RepoCompetition implements iRepoCompetition {
		public Set<Competition> competitions;

		
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

		@Override
		public String toString() {
			return "RepoCompetition [competitions=" + competitions + "]";
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
		
		

	}