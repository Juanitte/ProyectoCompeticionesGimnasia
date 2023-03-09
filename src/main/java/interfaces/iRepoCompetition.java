package interfaces;

import model.Competition;
import model.Group;

public interface iRepoCompetition {

	Competition crearCompeticion(String name, String date);
	void mostrarCompeticiones();
	boolean competicionDuplicada(Competition competition);
	Competition buscarCompeticionPorNombre(String name);
	Competition buscarCompeticionPorFecha(String fecha);
	void modificarCompeticion(Competition competition);
	Group buscarGrupo(String name);
	
}
