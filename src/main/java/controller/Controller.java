package controller;

import interfaces.iController;
import interfaces.iGUI;
import interfaces.iRepoCompetition;
import interfaces.iRepoGimnast;
import util.Utils;

public class Controller implements iController {

	private iGUI gui;
	private iRepoGimnast repoGimnast;
	private iRepoCompetition repoCompetition;
	private boolean inEnglish = false;
	

	public void start() {
		ejecutaMenuPrincipal();		
	}

	public void ejecutaMenuPrincipal() {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuPrincipal();
				option = Utils.intInput("Seleccione una opción: ");
				controlaMenuPrincipal(option);
			}else {
				gui.muestraMenuPrincipalEN();
				option = Utils.intInput("Choose an option: ");
				controlaMenuPrincipal(option);
			}
		}while(option != 0);
	}

	public void controlaMenuPrincipal(int option) {
		switch(option) {
		case 1:
			if(!inEnglish) {
				ejecutaMenuGestionCompeticiones();
			}
			break;
			
		case 2:
			if(!inEnglish) {
				ejecutaMenuGestionGimnastas();
			}
			break;
			
		case 3:
			if(!inEnglish) {
				ejecutaMenuIdioma();
			}
			break;
			
		case 0:
			if(!inEnglish) {
				Utils.showMessage("");
				Utils.showMessage("Cerrando App...");
			}else {
				Utils.showMessage("");
				Utils.showMessage("Closing App...");
			}
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
	}

	public void ejecutaMenuGestionCompeticiones() {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuCompeticiones();
				option = Utils.intInput("Seleccione una opción: ");
				controlaMenuGestionCompeticiones(option);
			}else {
				gui.muestraMenuCompeticionesEN();
				option = Utils.intInput("Choose an option: ");
				controlaMenuGestionCompeticiones(option);
			}
		}while(option != 0);
		
	}

	public void controlaMenuGestionCompeticiones(int option) {
		switch(option) {
		case 1:
			if(!inEnglish) {
				ejecutaMenuAgregarCompeticion();
			}
			break;
			
		case 2:
			if(!inEnglish) {
				ejecutaMenuGestionGimnastas();
			}
			break;
			
		case 3:
			if(!inEnglish) {
				ejecutaMenuIdioma();
			}
			break;
			
		case 0:
			if(!inEnglish) {
				Utils.showMessage("");
				Utils.showMessage("Cerrando App...");
			}else {
				Utils.showMessage("");
				Utils.showMessage("Closing App...");
			}
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuGestionGimnastas() {
		// TODO Auto-generated method stub
		
	}

	public void controlaMenuGestionGimnastas(int option) {
		// TODO Auto-generated method stub
		
	}

	public void ejecutaMenuIdioma() {
		// TODO Auto-generated method stub
		
	}

	public void controlaMenuIdioma(int option) {
		// TODO Auto-generated method stub
		
	}

	public void ejecutaMenuAgregarCompeticion() {
		// TODO Auto-generated method stub
		
	}

	public void controlaMenuAgregarCompeticion(int option) {
		// TODO Auto-generated method stub
		
	}
	
	
}
	


