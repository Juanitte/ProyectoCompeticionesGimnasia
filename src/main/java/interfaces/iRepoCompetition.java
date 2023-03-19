package interfaces;

import java.util.Set;

import model.Competition;

public interface iRepoCompetition {

	Set<Competition> getCompetitions();
	boolean agregarCompeticion(Competition competition);
	void mostrarCompeticiones();
	boolean competicionDuplicada(Competition competition);
	Competition buscarCompeticionPorNombre(String name);
	Competition buscarCompeticionPorFecha(String fecha);
	
}
