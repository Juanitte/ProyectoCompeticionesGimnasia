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
	boolean nombreDeGrupoDuplicado(String nombre); //Busca en el Set<Entry> de cada elemento del Set<Trial> de cada competicion del Set<Competition> del repositorio, comprobando solo las participaciones de grupos, si hay un nombre igual que el recibido.
	
}
