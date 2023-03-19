package interfaces;

import model.Competition;
import model.Group;

public interface iRepoCompetition {

	void mostrarCompeticiones();
	boolean competicionDuplicada(Competition competition);
	Competition buscarCompeticionPorNombre(String name);
	Competition buscarCompeticionPorFecha(String fecha);
	
}
