package interfaces;

public interface iController {

	void start();
	void ejecutaMenuPrincipal();
	void controlaMenuPrincipal(int option);
	void ejecutaMenuGestionCompeticiones();
	void controlaMenuGestionCompeticiones(int option);
	void ejecutaMenuAgregarCompeticion();
	void controlaMenuAgregarCompeticion(int option);
	void ejecutaMenuBuscarCompeticion();
	void controlaMenuBuscarCompeticion(int option);
	void ejecutaMenuAccionesCompeticion();
	void controlaMenuAccionesCompeticion(int option);
	void ejecutaMenuAgregarPrueba();
	void controlaMenuAgregarPrueba(int option);
	void ejecutaMenuAgregarTipo();
	void controlaMenuAgregarTipo();
	void ejecutaMenuAgregarCategoria();
	void controlaMenuAgregarCategoria();
	void ejecutaMenuAgregarAparato();
	void controlaMenuAgregarAparato();
	void ejecutaMenuBuscarPrueba();
	void ejecutaMenuAccionesPrueba();
	void controlaMenuAccionesPrueba(int option);
	
	void ejecutaMenuModificarCompeticion();
	void ejecutaMenuGestionGimnastas();
	void controlaMenuGestionGimnastas(int option);
	void ejecutaMenuIdioma();
	void controlaMenuIdioma(int option);
}
