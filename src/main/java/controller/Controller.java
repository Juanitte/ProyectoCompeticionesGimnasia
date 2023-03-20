package controller;

import interfaces.iController;
import interfaces.iGUI;
import interfaces.iRepoCompetition;
import interfaces.iRepoGimnast;
import model.Competition;
import model.Entry;
import model.Group;
import model.RepoCompetition;
import model.RepoGimnast;
import model.Trial;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Gimnast;
import model.DTO.Type;
import util.Utils;
import util.XMLManager;
import view.GUI;

public class Controller implements iController {

	private iGUI gui = new GUI();
	private iRepoGimnast repoGimnast = RepoGimnast.getInstance();
	private iRepoCompetition repoCompetition = RepoCompetition.getInstance();
	private boolean inEnglish = false;
	

	public void start() {
		try {
			repoCompetition = XMLManager.readXMLC("Competiciones.xml");
		}catch(Exception e) {
			
		}
		try {
			repoGimnast = XMLManager.readXMLG("Gimnastas.xml");
		}catch(Exception e) {
			
		}
		ejecutaMenuPrincipal();		
	}

	public void ejecutaMenuPrincipal() {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuPrincipal();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuPrincipalEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuPrincipal(option);
		}while(option != 0);
	}

	public void controlaMenuPrincipal(int option) {
		switch(option) {
		case 1:
			ejecutaMenuGestionCompeticiones();
			break;
			
		case 2:
			ejecutaMenuGestionGimnastas();
			break;
			
		case 3:
			ejecutaMenuIdioma();
			break;
			
		case 0:
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			if(XMLManager.writeXML(repoGimnast, "Gimnastas.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando gimnastas...");
				}else {
					Utils.showMessage("Saving gimnasts...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar los/las gimnastas.");
				}else {
					Utils.showMessage("An error ocurred while saving gimnasts.");
				}
			}
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
			}else {
				gui.muestraMenuCompeticionesEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuGestionCompeticiones(option);
		}while(option != 0);
		
	}

	public void controlaMenuGestionCompeticiones(int option) {
		switch(option) {
		case 1:
			ejecutaMenuAgregarCompeticion();
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			break;
			
		case 2:
			ejecutaMenuBuscarCompeticion();
			break;
			
		case 3:
			repoCompetition.mostrarCompeticiones();
			break;
			
		case 0:
			
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
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuGimnastas();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuGimnastasEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuGestionGimnastas(option);
		}while(option != 0);
		
	}

	public void controlaMenuGestionGimnastas(int option) {
		Gimnast gimnast = null;
		switch(option) {
		case 1:
			ejecutaMenuAgregarGimnasta();
			if(XMLManager.writeXML(repoGimnast, "Gimnastas.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando gimnastas...");
				}else {
					Utils.showMessage("Saving gimnasts...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar los/las gimnastas.");
				}else {
					Utils.showMessage("An error ocurred while saving gimnasts.");
				}
			}
			break;
			
		case 2:
			gimnast = ejecutaMenuBuscarGimnasta();
			if(gimnast != null) {
				ejecutaMenuAccionesGimnasta(gimnast);
			}
			break;
			
		case 3:
			repoGimnast.mostrarGimnastas();
			break;
			
		case 0:
			
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuIdioma() {
		int option = -1;
		
		do {
			if(!inEnglish) {
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuIdioma(option);
		}while(option != 0);
		
	}

	public void controlaMenuIdioma(int option) {
		switch(option) {
		case 1:
			this.inEnglish = false;
			break;
			
		case 2:
			this.inEnglish = true;
			break;
			
		case 0:
			break;
			
		default:
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuAgregarCompeticion() {
		Competition competition = new Competition();
		String name = "";
		String date = "";
		String description = "";
	
		if(!inEnglish) {
			gui.muestraMenuAgregarCompeticion();
			do {
				name = Utils.stringInput("Introduzca el nombre: ");
				description = Utils.stringInput("Introduzca la descripción: ");
				do {
					date = Utils.stringInput("Introduzca la fecha(AAAA-MM-DD): ");
					if(!Utils.validaFecha(date)) {
						Utils.showMessage("Formato de fecha incorrecto.");
					}
				}while(!Utils.validaFecha(date));
				competition.setNombre(name);
				competition.setFecha(date);
				competition.setDescription(description);
				if(repoCompetition.competicionDuplicada(competition)) {
					Utils.showMessage("Esa Competición ya existe.");
				}
			}while(repoCompetition.competicionDuplicada(competition));
		}else {
			gui.muestraMenuAgregarCompeticionEN();
			do {
				name = Utils.stringInput("Introduce Name: ");
				description = Utils.stringInput("Introduce a description: ");
				do {
					date = Utils.stringInput("Introduce Date(AAAA-MM-DD): ");
					if(!Utils.validaFecha(date)) {
						Utils.showMessage("Incorrect date format.");
					}
				}while(!Utils.validaFecha(date));
				competition.setNombre(name);
				competition.setFecha(date);
				competition.setDescription(description);
				if(repoCompetition.competicionDuplicada(competition)) {
					Utils.showMessage("This Competition already exists.");
				}
			}while(repoCompetition.competicionDuplicada(competition));
		}
		if(repoCompetition.agregarCompeticion(competition)){
			if(!inEnglish) {
				Utils.showMessage("Competición agregada con éxito.");
			}else {
				Utils.showMessage("Competition added succesfully.");
			}
		}else {
			Utils.showMessage("Error.");
		}
		
	}

	public void ejecutaMenuBuscarCompeticion() {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuBuscarCompeticion();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuBuscarCompeticionEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuBuscarCompeticion(option);
		}while(option < 0 || option > 2);
		
	}

	public void controlaMenuBuscarCompeticion(int option) {
		Competition competition = null;
		switch(option) {
		case 1:
			String name = "";
			if(!inEnglish) {
				name = Utils.stringInput("Introduzca el nombre a buscar: ");
			}else {
				name = Utils.stringInput("Introduce the name to search for: ");
			}
			competition = repoCompetition.buscarCompeticionPorNombre(name);
			if(competition != null) {
				Utils.showMessage("");
				Utils.showMessage(competition.toString());
				Utils.showMessage("");
				ejecutaMenuAccionesCompeticion(competition);
			}else {
				if(!inEnglish) {
					Utils.showMessage("No se encontró la competición.");
				}else {
					Utils.showMessage("Couldn't find the competition.");
				}
			}
			break;
			
		case 2:
			String date = "";
			if(!inEnglish) {
				name = Utils.stringInput("Introduzca la fecha a buscar(AAAA-MM-DD): ");
			}else {
				name = Utils.stringInput("Introduce the date to search for(YYYY-MM-DD): ");
			}
			competition = repoCompetition.buscarCompeticionPorFecha(date);
			if(competition != null) {
				Utils.showMessage("");
				Utils.showMessage(competition.toString());
				Utils.showMessage("");
				ejecutaMenuAccionesCompeticion(competition);
			}else {
				if(!inEnglish) {
					Utils.showMessage("No se encontró la competición.");
				}else {
					Utils.showMessage("Couldn't find the competition.");
				}
			}
			break;
			
		case 0:
			
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuAccionesCompeticion(Competition competition) {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuAccionesCompeticion();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAccionesCompeticionEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuAccionesCompeticion(option, competition);
		}while(option != 0);
		
	}

	public void controlaMenuAccionesCompeticion(int option, Competition competition) {
		switch(option) {
		case 1:
			ejecutaMenuAgregarPrueba(competition);
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			
			break;
			
		case 2:
			ejecutaMenuBuscarPrueba(competition);
			break;
			
		case 3:
			repoCompetition.mostrarCompeticiones();
			break;
			
		case 4:
			ejecutaMenuModificarCompeticion(competition);
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			break;
			
		case 5:
			if(ejecutaMenuConfirmacion()) {
				repoCompetition.getCompetitions().remove(competition);
				if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
					if(!inEnglish) {
						Utils.showMessage("Guardando competiciones...");
					}else {
						Utils.showMessage("Saving competitions...");
					}
				}else {
					if(!inEnglish) {
						Utils.showMessage("Error al guardar las competiciones.");
					}else {
						Utils.showMessage("An error ocurred while saving competitions.");
					}
				}
			}
			
		case 0:
			
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuAgregarPrueba(Competition competition) {
		Trial trial = new Trial();
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarPrueba();
				Utils.showMessage("");
				trial.setNombre(Utils.stringInput("Introduzca el nombre de la prueba: "));
			}else {
				gui.muestraMenuAgregarPruebaEN();
				Utils.showMessage("");
				trial.setNombre(Utils.stringInput("Introduce the trial's name: "));
			}
			ejecutaMenuAgregarTipo(trial);
			trial.setCategoria(ejecutaMenuAgregarCategoria());
			ejecutaMenuAgregarAparato(trial);
			if(competition.pruebaDuplicada(trial)) {
				if(!inEnglish) {
					Utils.showMessage("");
					Utils.showMessage("Esa prueba ya existe.");
					Utils.showMessage("");
				}else {
					Utils.showMessage("");
					Utils.showMessage("This trial already exists.");
					Utils.showMessage("");
				}
			}
		}while(competition.pruebaDuplicada(trial));
		competition.agregarPrueba(trial);
	}

	public void ejecutaMenuAgregarTipo(Trial trial) {
		int option = -1;
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarTipo();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAgregarTipoEN();
				option = Utils.intInput("Choose an option: ");			
			}
		}while(option != 1 && option != 2);
		controlaMenuAgregarTipo(option, trial);
	}

	public void controlaMenuAgregarTipo(int option, Trial trial) {
		switch(option) {
		case 1:
			trial.setTipo(Type.INDIVIDUAL);
			break;
			
		case 2:
			trial.setTipo(Type.GRUPO);
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public Category ejecutaMenuAgregarCategoria() {
		int option = -1;
		Category category = null;
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarCategoria();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAgregarCategoriaEN();
				option = Utils.intInput("Choose an option: ");			
			}
		}while(option <= 0 || option >= 7);
		category = controlaMenuAgregarCategoria(option);
		return category;
		
	}

	public Category controlaMenuAgregarCategoria(int option) {
		switch(option) {
		case 1:
			return Category.PREBENJAMIN;
			
		case 2:
			return Category.BENJAMIN;
			
		case 3:
			return Category.ALEVIN;
			
		case 4:
			return Category.INFANTIL;
			
		case 5:
			return Category.JUNIOR;
			
		case 6:
			return Category.SENIOR;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
			return null;
		}
		
	}

	public void ejecutaMenuAgregarAparato(Trial trial) {
		int option = -1;
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarAparato();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAgregarAparatoEN();
				option = Utils.intInput("Choose an option: ");			
			}
		}while(option <= 0 || option >= 6);
		controlaMenuAgregarAparato(option, trial);
		
	}

	public void controlaMenuAgregarAparato(int option, Trial trial) {
		switch(option) {
		case 1:
			trial.setAparato(Gadget.MAZAS);
			break;
			
		case 2:
			trial.setAparato(Gadget.ARO);
			break;
			
		case 3:
			trial.setAparato(Gadget.CINTA);
			break;
			
		case 4:
			trial.setAparato(Gadget.CUERDA);
			break;
			
		case 5:
			trial.setAparato(Gadget.MANOSLIBRES);
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuBuscarPrueba(Competition competition) {
		Trial trial = new Trial();
		do {
			if(!inEnglish) {
				gui.muestraMenuBuscarPrueba();				
			}else {
				gui.muestraMenuBuscarPruebaEN();				
			}
			ejecutaMenuAgregarTipo(trial);
			trial.setCategoria(ejecutaMenuAgregarCategoria());			
			ejecutaMenuAgregarAparato(trial);
			trial = competition.buscarPrueba(trial.getTipo(), trial.getCategoria(), trial.getAparato());
			if(trial != null) {
				Utils.showMessage("");
				Utils.showMessage(trial.toString());
				Utils.showMessage("");
			}else {
				if(!inEnglish) {
					Utils.showMessage("No se pudo encontrar la prueba.");
				}else {
					Utils.showMessage("Couldn't find that trial.");
				}
			}
		}while(trial == null);
		ejecutaMenuAccionesPrueba(trial, competition);
		
	}

	public void ejecutaMenuAccionesPrueba(Trial trial, Competition competition) {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuAccionesPrueba();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAccionesPruebaEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuAccionesPrueba(option, trial, competition);
		}while(option != 0);
		
	}

	public void controlaMenuAccionesPrueba(int option, Trial trial, Competition competition) {
		switch(option) {
		case 1:
			ejecutaMenuAgregarParticipacion(trial);
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			break;
			
		case 2:
			ejecutaMenuBuscarParticipacion(trial);
			break;
			
		case 3:
			trial.mostrarParticipaciones();
			break;
			
		case 4:
			ejecutaMenuModificarPrueba(trial);
			if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando competiciones...");
				}else {
					Utils.showMessage("Saving competitions...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar las competiciones.");
				}else {
					Utils.showMessage("An error ocurred while saving competitions.");
				}
			}
			break;
			
		case 5:
			if(ejecutaMenuConfirmacion()) {
				if(competition.getTrials().remove(trial)) {
					if(!inEnglish) {
						Utils.showMessage("Prueba eliminada con éxito.");
					}else {
						Utils.showMessage("Trial removed succesfully.");
					}
					if(XMLManager.writeXML(repoCompetition, "Competiciones.xml")) {
						if(!inEnglish) {
							Utils.showMessage("Guardando competiciones...");
						}else {
							Utils.showMessage("Saving competitions...");
						}
					}else {
						if(!inEnglish) {
							Utils.showMessage("Error al guardar las competiciones.");
						}else {
							Utils.showMessage("An error ocurred while saving competitions.");
						}
					}
				}else {
					Utils.showMessage("Error.");
				}
			}
			
			
		case 0:
			
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public <T> void ejecutaMenuAgregarParticipacion(Trial trial) {
		Entry<T> entry = new Entry<T>();
		String hora = "";
		if(!inEnglish) {
			gui.muestraMenuAgregarParticipacion();
			do {
				do {
					hora = Utils.stringInput("Introduzca la hora de participación(HH:MM): ");
					if(!Utils.validaHora(hora)) {
							Utils.showMessage("El formato de la hora no es correcto(HH:MM).");
					}else {
						entry.setTime(hora);
					}
				}while(!Utils.validaHora(hora));
				if(trial.horaDuplicada(entry)) {
						Utils.showMessage("Ya hay un participante a esa hora.");
				}
			}while(trial.horaDuplicada(entry));
		}else {
			gui.muestraMenuAgregarParticipacionEN();
			do {
				do {
					hora = Utils.stringInput("Introduce the entry time(HH:MM): ");
					if(!Utils.validaHora(hora)) {
							Utils.showMessage("Wrong time format(HH:MM).");
					}else {
						entry.setTime(hora);
					}
				}while(!Utils.validaHora(hora));
				if(trial.horaDuplicada(entry)) {
						Utils.showMessage("There's already an entry at that time.");
				}
			}while(trial.horaDuplicada(entry));
		}
		ejecutaMenuAgregarParticipante(trial, entry);
		if(trial.getParticipaciones().add(entry)) {
			if(!inEnglish) {
				Utils.showMessage("Participación agregada con éxito.");
			}else {
				Utils.showMessage("Entry added succesfully.");
			}
		}else {
			Utils.showMessage("Error.");
		}
		
	}

	public <T> void ejecutaMenuAgregarParticipante(Trial trial, Entry<T> entry) {
		int option = -1;
		boolean isCreated = false;
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarParticipante();
				option = Utils.intInput("Seleccione una opción: ");
				if(trial.getTipo() == Type.GRUPO && !isCreated && option == 1) {
					isCreated = true;
					Group group = new Group();
					String nombre = "";
					do {
						nombre = Utils.stringInput("Introduzca el nombre del grupo: ");
						if(!trial.nombreDeGrupoDuplicado(nombre)) {
							group.setNombre(nombre);
						}else {
							Utils.showMessage("El nombre introducido ya existe.");
						}
					}while(trial.nombreDeGrupoDuplicado(nombre));
					group.setClub(Utils.stringInput("Introduzca el nombre del club: "));
					entry.setParticipante((T) group);
					
				}
				controlaMenuAgregarParticipante(option, trial, entry);
			}else {
				gui.muestraMenuAgregarParticipanteEN();
				option = Utils.intInput("Choose an option: ");
				if(trial.getTipo() == Type.GRUPO && !isCreated && option == 1) {
					isCreated = true;
					Group group = new Group();
					String nombre = "";
					do {
						nombre = Utils.stringInput("Introduce the group's name: ");
						if(!trial.nombreDeGrupoDuplicado(nombre)) {
							group.setNombre(nombre);
						}else {
							Utils.showMessage("That name already exists.");
						}
					}while(trial.nombreDeGrupoDuplicado(nombre));
					group.setClub(Utils.stringInput("Introduce the club's name: "));
					entry.setParticipante((T) group);					
				}
				controlaMenuAgregarParticipante(option, trial, entry);
			}
		}while(trial.getTipo() == Type.GRUPO && option != 0);
		
	}

	public <T> void controlaMenuAgregarParticipante(int option, Trial trial, Entry<T> entry) {
		Gimnast gimnast = null;
		switch(option) {
			case 1:
				do {
					gimnast = ejecutaMenuBuscarGimnasta();
					if(gimnast != null) {
						if(ejecutaMenuConfirmacion()) {
							if(trial.getTipo() == Type.INDIVIDUAL) {
								entry.setParticipante((T) gimnast);
							}else {
								if(((Group)entry.getParticipante()).getGimnasts().isEmpty()) {
									((Group)entry.getParticipante()).getGimnasts().add(gimnast);
								}else {
									if(((Group)entry.getParticipante()).gimnastasCompatibles(gimnast)) {
										((Group)entry.getParticipante()).getGimnasts().add(gimnast);
									}else {
										if(!inEnglish) {
											Utils.showMessage("Gimnastas incompatibles.");
										}else {
											Utils.showMessage("Incompatible gimnasts.");
										}
									}
								}
							}
						}
					}
				}while(gimnast == null);
				break;
				
			case 0:
				if(trial.getTipo() == Type.INDIVIDUAL) {
					if(!inEnglish) {
						Utils.showMessage("Debes elegir un/a gimnasta.");
					}else {
						Utils.showMessage("Select a gimnast.");
					}
					controlaMenuAgregarParticipante(option, trial, entry);
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

	public <T> void ejecutaMenuBuscarParticipacion(Trial trial) {
		Entry<T> entry = new Entry<T>();
		do {
			if(!inEnglish) {
				gui.muestraMenuBuscarParticipacion();				
			}else {
				gui.muestraMenuBuscarParticipacionEN();				
			}
			int dorsal = -1;
			if(!inEnglish) {
				dorsal = Utils.intInput("Introduzca el dorsal a buscar: ");
			}else {
				dorsal = Utils.intInput("Introduce the Entry Number to search for: ");
			}
			entry = trial.buscarParticipacion(dorsal);
			if(entry != null) {
				Utils.showMessage("");
				Utils.showMessage(entry.toString());
				Utils.showMessage("");
			}else {
				if(!inEnglish) {
					Utils.showMessage("No se pudo encontrar la participación.");
				}else {
					Utils.showMessage("Couldn't find that entry.");
				}
			}
		}while(entry == null);
		
	}

	public void ejecutaMenuModificarPrueba(Trial trial) {
		String nombre = "";
		if(!inEnglish) {
			gui.muestraMenuModificarPrueba();
			nombre = Utils.stringInput("Introduzca el nuevo nombre: ");
		}else {
			gui.muestraMenuModificarPruebaEN();
			nombre = Utils.stringInput("Introduce the new name: ");
		}
		trial.setNombre(nombre);
		
	}

	public void ejecutaMenuModificarCompeticion(Competition competition) {
		String nombre = "";
		String fecha = "";
		String descripcion = "";
		Competition newCompetition = new Competition();
		
		if(!inEnglish) {
			do {
				nombre = Utils.stringInput("Introduzca el nuevo nombre: ");
				descripcion = Utils.stringInput("Introduzca la nueva descripción: ");
				do {
					fecha = Utils.stringInput("Introduzca la nueva fecha: ");
				}while(!Utils.validaFecha(fecha));
				newCompetition.setNombre(nombre);
				newCompetition.setFecha(fecha);
				newCompetition.setDescription(descripcion);
				if(repoCompetition.competicionDuplicada(newCompetition)) {
					Utils.showMessage("Ya existe una competición con esos datos.");
				}else {
					Utils.showMessage("Competición modificada.");
				}
			}while(repoCompetition.competicionDuplicada(newCompetition));
			competition.setNombre(nombre);
			competition.setFecha(fecha);
			competition.setDescription(descripcion);
		}else {
			do {
				nombre = Utils.stringInput("Introduce a new name: ");
				descripcion = Utils.stringInput("Introduce a new description: ");
				do {
					fecha = Utils.stringInput("Introduce a new date: ");
				}while(!Utils.validaFecha(fecha));
				newCompetition.setNombre(nombre);
				newCompetition.setFecha(fecha);
				newCompetition.setDescription(descripcion);
				if(repoCompetition.competicionDuplicada(newCompetition)) {
					Utils.showMessage("This competition already exists.");
				}else {
					Utils.showMessage("Competition updated.");
				}
			}while(repoCompetition.competicionDuplicada(newCompetition));
			competition.setNombre(nombre);
			competition.setFecha(fecha);
			competition.setDescription(descripcion);
		}
		
	}

	public boolean ejecutaMenuConfirmacion() {
		int option = -1;
		boolean isConfirmed = false;
			if(!inEnglish) {
				gui.muestraMenuConfirmacion();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuConfirmacionEN();
				option = Utils.intInput("Choose an option: ");
			}
		isConfirmed = controlaMenuConfirmacion(option);
		return isConfirmed;
	}

	public boolean controlaMenuConfirmacion(int option) {
		boolean isConfirmed = false;
		switch(option) {
		case 1:
			isConfirmed = true;
			break;
		
		case 2:
			isConfirmed = false;
			break;
		
		default:
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		return isConfirmed;
		
	}

	public void ejecutaMenuAgregarGimnasta() {
		Gimnast gimnast = new Gimnast();
		String name = "";
		String dni = "";
		String email = "";
		String phoneNumber = "";
		String club = "";
	
		if(!inEnglish) {
			gui.muestraMenuAgregarGimnasta();
			do {
				do {
					name = Utils.stringInput("Introduzca el nombre: ");
				}while(!Utils.compruebaNombre(name));
				do {
					do {
						dni = Utils.stringInput("Introduzca el DNI: ");
						if(!Utils.validaDni(dni)) {
							Utils.showMessage("Formato de DNI incorrecto.");
						}
					}while(!Utils.validaDni(dni));
					if(!Utils.validaLetraDni(dni)) {
						Utils.showMessage("Letra de DNI incorrecta.");
					}
				}while(!Utils.validaLetraDni(dni));
				do {
					email = Utils.stringInput("Introduzca el email: ");
					if(!Utils.validaEmail(email)) {
						Utils.showMessage("Email en formato incorrecto.");
					}
				}while(!Utils.validaEmail(email));
				do {
					phoneNumber = Utils.stringInput("Introduzca el número de teléfono en formato internacional(P.Ej: +34123456789): ");
					if(!Utils.validaNumeroTelefono(phoneNumber)) {
						Utils.showMessage("Número de teléfono en formato incorrecto.");
					}
				}while(!Utils.validaNumeroTelefono(phoneNumber));
				club = Utils.stringInput("Introduczca el nombre del club: ");
				gimnast.setName(name);
				gimnast.setDni(dni);
				gimnast.setEmail(email);
				gimnast.setPhoneNumber(phoneNumber);
				gimnast.setClub(club);
				gimnast.setCategory(ejecutaMenuAgregarCategoria());
				if(repoGimnast.gimnastaDuplicado(gimnast)) {
					Utils.showMessage("Ese/esa gimnasta ya existe.");
				}
			}while(repoGimnast.gimnastaDuplicado(gimnast));
		}else {
			gui.muestraMenuAgregarGimnastaEN();
			do {
				do {
					name = Utils.stringInput("Introduce the name: ");
				}while(!Utils.compruebaNombre(name));
				do {
					do {
						dni = Utils.stringInput("Introduce the DNI: ");
						if(!Utils.validaDni(dni)) {
							Utils.showMessage("Incorrect DNI format.");
						}
					}while(!Utils.validaDni(dni));
					if(!Utils.validaLetraDni(dni)) {
						Utils.showMessage("Incorrect DNI.");
					}
				}while(!Utils.validaLetraDni(dni));
				do {
					email = Utils.stringInput("Introduce the email: ");
					if(!Utils.validaEmail(email)) {
						Utils.showMessage("Incorrect email format.");
					}
				}while(!Utils.validaEmail(email));
				do {
					phoneNumber = Utils.stringInput("Introduce the international phone number(P.Ej: +34123456789): ");
					if(!Utils.validaNumeroTelefono(phoneNumber)) {
						Utils.showMessage("Incorrect phone number format.");
					}
				}while(!Utils.validaNumeroTelefono(phoneNumber));
				club = Utils.stringInput("Introduce the club's name: ");
				gimnast.setName(name);
				gimnast.setDni(dni);
				gimnast.setEmail(email);
				gimnast.setPhoneNumber(phoneNumber);
				gimnast.setClub(club);
				gimnast.setCategory(ejecutaMenuAgregarCategoria());
				if(repoGimnast.gimnastaDuplicado(gimnast)) {
					Utils.showMessage("That gimnast already exists.");
				}
			}while(repoGimnast.gimnastaDuplicado(gimnast));
		}
		if(repoGimnast.agregarGimnasta(gimnast)){
			if(!inEnglish) {
				Utils.showMessage("Gimnasta agregado/a con éxito.");
			}else {
				Utils.showMessage("Gimnast added succesfully.");
			}
		}else {
			Utils.showMessage("Error.");
		}
	}

	public Gimnast ejecutaMenuBuscarGimnasta() {
		Gimnast gimnast = null;
		
		String dni = "";
		if(!inEnglish) {
			dni = Utils.stringInput("Introduzca el dni a buscar: ");
		}else {
			dni = Utils.stringInput("Introduce the dni to search for: ");
		}
		gimnast = repoGimnast.buscarGimnastaPorDNI(dni);
		if(gimnast != null) {
			Utils.showMessage("");
			Utils.showMessage(gimnast.toString());
			Utils.showMessage("");
		}
		return gimnast;
		
	}

	public void ejecutaMenuAccionesGimnasta(Gimnast gimnast) {
		int option = -1;
		
		do {
			if(!inEnglish) {
				gui.muestraMenuAccionesGimnasta();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAccionesGimnastaEN();
				option = Utils.intInput("Choose an option: ");
			}
			controlaMenuAccionesGimnasta(option, gimnast);
		}while(option != 0);
		
	}

	public void controlaMenuAccionesGimnasta(int option, Gimnast gimnast) {
		switch(option) {
		case 1:
			ejecutaMenuModificarGimnasta(gimnast);
			if(XMLManager.writeXML(repoGimnast, "Gimnastas.xml")) {
				if(!inEnglish) {
					Utils.showMessage("Guardando gimnastas...");
				}else {
					Utils.showMessage("Saving gimnasts...");
				}
			}else {
				if(!inEnglish) {
					Utils.showMessage("Error al guardar los/las gimnastas.");
				}else {
					Utils.showMessage("An error ocurred while saving gimnasts.");
				}
			}
			break;
			
		case 2:
			if(ejecutaMenuConfirmacion()) {
				if(repoGimnast.eliminarGimnasta(gimnast)){
					if(!inEnglish) {
						Utils.showMessage("El/la gimnasta fue borrado/a con éxito.");
					}else {
						Utils.showMessage("The gimnast was removed correctly.");
					}
					if(XMLManager.writeXML(repoGimnast, "Gimnastas.xml")) {
						if(!inEnglish) {
							Utils.showMessage("Guardando gimnastas...");
						}else {
							Utils.showMessage("Saving gimnasts...");
						}
					}else {
						if(!inEnglish) {
							Utils.showMessage("Error al guardar los/las gimnastas.");
						}else {
							Utils.showMessage("An error ocurred while saving gimnasts.");
						}
					}
				}else {
					if(!inEnglish) {
						Utils.showMessage("Hubo un error al borrar el/la gimnasta.");
					}else {
						Utils.showMessage("An error ocurred.");
					}
				}
			}
			break;
			
		case 0:
			
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
		}
		
	}

	public void ejecutaMenuModificarGimnasta(Gimnast gimnast) {
		boolean isDuplicated = false;
		Gimnast gimnasta = new Gimnast();
		String dni = "";
		String name = "";
		String email = "";
		String phone = "";
		String club = "";
		Category category = null;
		if(!inEnglish) {
			do {
				do {
					do {
						dni = Utils.stringInput("Introduzca el nuevo DNI: ");
						if(!Utils.validaDni(dni)) {
							Utils.showMessage("Formato de DNI incorrecto.");
						}
					}while(!Utils.validaDni(dni));
					if(!Utils.validaLetraDni(dni)) {
						Utils.showMessage("Letra de DNI incorrecta.");
					}
				}while(!Utils.validaLetraDni(dni));
				gimnasta.setDni(dni);
				do {
					name = Utils.stringInput("Introduzca el nuevo nombre: ");
					if(!Utils.compruebaNombre(name)) {
						Utils.showMessage("Nombre incorrecto");
					}
				}while(!Utils.compruebaNombre(name));
				do {
					email = Utils.stringInput("Introduzca el nuevo email: ");
					if(!Utils.validaEmail(email)) {
						Utils.showMessage("Email en formato incorrecto.");
					}
				}while(!Utils.validaEmail(email));
				do {
					phone = Utils.stringInput("Introduzca el nuevo número de teléfono en formato internacional(+34123456789): ");
					if(!Utils.validaNumeroTelefono(phone)) {
						Utils.showMessage("Número de teléfono en formato incorrecto.");
					}
				}while(!Utils.validaNumeroTelefono(phone));
				club = Utils.stringInput("Introduzca en nuevo nombre de club:");
				category = ejecutaMenuAgregarCategoria();
				if(!gimnast.getDni().equalsIgnoreCase(dni)) {
					if(repoGimnast.gimnastaDuplicado(gimnasta)) {
						Utils.showMessage("Ese/a gimnasta ya existe.");
						isDuplicated = true;
					}else {
						isDuplicated = false;
					}
				}else {
					isDuplicated = false;
				}
			}while(isDuplicated);
			if(ejecutaMenuConfirmacion()) {
				repoGimnast.modificarGimnasta(gimnast, dni, name, email, category, club, phone);
			}
		}else {
			do {
				do {
					do {
						dni = Utils.stringInput("Introduce the new DNI: ");
						if(!Utils.validaDni(dni)) {
							Utils.showMessage("Icorrect DNI format.");
						}
					}while(!Utils.validaDni(dni));
					if(!Utils.validaLetraDni(dni)) {
						Utils.showMessage("Incorrect DNI.");
					}
				}while(!Utils.validaLetraDni(dni));
				gimnasta.setDni(dni);
				do {
					name = Utils.stringInput("Introduce the new name: ");
					if(!Utils.compruebaNombre(name)) {
						Utils.showMessage("Incorrect name.");
					}
				}while(!Utils.compruebaNombre(name));
				do {
					email = Utils.stringInput("Introduce the new email: ");
					if(!Utils.validaEmail(email)) {
						Utils.showMessage("Incorrect email format.");
					}
				}while(!Utils.validaEmail(email));
				do {
					phone = Utils.stringInput("Introduce the new international phone number(+34123456789): ");
					if(!Utils.validaNumeroTelefono(phone)) {
						Utils.showMessage("Incorrect phone number format.");
					}
				}while(!Utils.validaNumeroTelefono(phone));
				club = Utils.stringInput("Introduce the new club's name:");
				category = ejecutaMenuAgregarCategoria();
				if(repoGimnast.gimnastaDuplicado(gimnasta)) {
					Utils.showMessage("That gimnast already exists.");
				}
			}while(repoGimnast.gimnastaDuplicado(gimnasta));
			if(ejecutaMenuConfirmacion()) {
				repoGimnast.modificarGimnasta(gimnast, dni, name, email, category, club, phone);
			}
		}
		
	}
	
	
}
	


