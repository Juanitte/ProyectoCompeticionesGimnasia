package interfaces;

import model.Competition;
import model.Entry;
import model.Trial;
import model.DTO.Gimnast;

public interface iController {

	void start();
	void ejecutaMenuPrincipal();
	void controlaMenuPrincipal(int option);
	void ejecutaMenuGestionCompeticiones();
	void controlaMenuGestionCompeticiones(int option);
	void ejecutaMenuAgregarCompeticion();
	void ejecutaMenuBuscarCompeticion();
	void controlaMenuBuscarCompeticion(int option);
	void ejecutaMenuAccionesCompeticion(Competition competition);
	void controlaMenuAccionesCompeticion(int option, Competition competition);
	void ejecutaMenuAgregarPrueba(Competition competition);
	void ejecutaMenuAgregarTipo(Trial trial);
	void controlaMenuAgregarTipo(int option, Trial trial);
	void ejecutaMenuAgregarCategoria(Trial trial);
	void controlaMenuAgregarCategoria(int option, Trial trial);
	void ejecutaMenuAgregarAparato(Trial trial);
	void controlaMenuAgregarAparato(int option, Trial trial);
	void ejecutaMenuBuscarPrueba(Competition competition);
	void ejecutaMenuAccionesPrueba(Trial trial, Competition competition);
	void controlaMenuAccionesPrueba(int option, Trial trial, Competition competition);
	<T> void ejecutaMenuAgregarParticipacion(Trial trial);
	<T> void ejecutaMenuAgregarParticipante(Trial trial, Entry<T> entry);
	<T> void controlaMenuAgregarParticipante(int option, Trial trial, Entry<T> entry);
	<T> void ejecutaMenuBuscarParticipacion(Trial trial);
	void ejecutaMenuModificarPrueba(Trial trial);
	void ejecutaMenuModificarCompeticion(Competition competition);
	boolean ejecutaMenuConfirmacion();
	boolean controlaMenuConfirmacion(int option);
	void ejecutaMenuGestionGimnastas();
	void controlaMenuGestionGimnastas(int option);
	void ejecutaMenuAgregarGimnasta();
	Gimnast ejecutaMenuBuscarGimnasta();
	Gimnast controlaMenuBuscarGimnasta(int option, Gimnast gimnast);
	void ejecutaMenuAccionesGimnasta();
	void controlaMenuAccionesGimnasta(int option);
	void ejecutaMenuModificarGimnasta();
	void ejecutaMenuIdioma();
	void controlaMenuIdioma(int option);
}
