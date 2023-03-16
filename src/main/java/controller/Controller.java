package controller;

import interfaces.iController;
import interfaces.iGUI;
import interfaces.iRepoCompetition;
import interfaces.iRepoGimnast;
import model.Competition;
import model.Entry;
import model.Group;
import model.Trial;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Gimnast;
import model.DTO.Type;
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
				competition.setName(name);
				competition.setDate(date);
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
				competition.setName(name);
				competition.setDate(date);
				competition.setDescription(description);
				if(repoCompetition.competicionDuplicada(competition)) {
					Utils.showMessage("This Competition already exists.");
				}
			}while(repoCompetition.competicionDuplicada(competition));
		}
		repoCompetition.getCompetitions().add(competition);
		
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
			break;
			
		case 2:
			ejecutaMenuBuscarPrueba(competition);
			break;
			
		case 3:
			repoCompetition.mostrarCompeticiones();
			break;
			
		case 4:
			ejecutaMenuModificarCompeticion(competition);
			break;
			
		case 5:
			ejecutaMenuConfirmacion();
				repoCompetition.getCompetitions().remove(competition);
			
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
			ejecutaMenuAgregarCategoria(trial);
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
		}while(option != 1 || option != 2);
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

	public void ejecutaMenuAgregarCategoria(Trial trial) {
		int option = -1;
		do {
			if(!inEnglish) {
				gui.muestraMenuAgregarCategoria();
				option = Utils.intInput("Seleccione una opción: ");
			}else {
				gui.muestraMenuAgregarCategoriaEN();
				option = Utils.intInput("Choose an option: ");			
			}
		}while(option != 1 || option != 2);
		controlaMenuAgregarCategoria(option, trial);
		
	}

	public void controlaMenuAgregarCategoria(int option, Trial trial) {
		switch(option) {
		case 1:
			trial.setCategoria(Category.PREBENJAMIN);
			break;
			
		case 2:
			trial.setCategoria(Category.BENJAMIN);
			break;
			
		case 3:
			trial.setCategoria(Category.ALEVIN);
			break;
			
		case 4:
			trial.setCategoria(Category.INFANTIL);
			break;
			
		case 5:
			trial.setCategoria(Category.JUNIOR);
			break;
			
		case 6:
			trial.setCategoria(Category.SENIOR);
			break;
			
		default: 
			if(!inEnglish) {
				Utils.showMessage("Opción Incorrecta.");
			}else {
				Utils.showMessage("Incorrect option.");
			}
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
		}while(option != 1 || option != 2);
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
			ejecutaMenuAgregarCategoria(trial);
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
			break;
			
		case 2:
			ejecutaMenuBuscarParticipacion(trial);
			break;
			
		case 3:
			trial.mostrarParticipaciones();
			break;
			
		case 4:
			ejecutaMenuModificarPrueba(trial);
			break;
			
		case 5:
			ejecutaMenuConfirmacion();
			repoCompetition.getCompetitions().getTrials().remove(trial);
			
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
					}
				}while(!Utils.validaHora(hora));
				if(trial.horaDuplicada(hora)) {
						Utils.showMessage("Ya hay un participante a esa hora.");
				}
			}while(trial.horaDuplicada(hora));
		}else {
			gui.muestraMenuAgregarParticipacionEN();
			do {
				do {
					hora = Utils.stringInput("Introduce the entry time(HH:MM): ");
					if(!Utils.validaHora(hora)) {
							Utils.showMessage("Wrong time format(HH:MM).");
					}
				}while(!Utils.validaHora(hora));
				if(trial.horaDuplicada(hora)) {
						Utils.showMessage("There's already an entry at that time.");
				}
			}while(trial.horaDuplicada(hora));
		}
		entry.setTime(hora);
		ejecutaMenuAgregarParticipante(trial, entry);
		trial.getParticipaciones().add(entry);
		
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
						if(!repoCompetition.nombreDeGrupoDuplicado(nombre)) {
							group.setNombre(nombre);
						}else {
							Utils.showMessage("El nombre introducido ya existe.");
						}
					}while(repoCompetition.nombreDeGrupoDuplicado(nombre));
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
						if(!repoCompetition.nombreDeGrupoDuplicado(nombre)) {
							group.setNombre(nombre);
						}else {
							Utils.showMessage("That name already exists.");
						}
					}while(repoCompetition.nombreDeGrupoDuplicado(nombre));
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
				gimnast = ejecutaMenuBuscarGimnasta();
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
				newCompetition.setName(nombre);
				newCompetition.setDate(fecha);
				newCompetition.setDescription(descripcion);
				if(repoCompetition.competicionDuplicada(newCompetition)) {
					Utils.showMessage("Ya existe una competición con esos datos.");
				}else {
					Utils.showMessage("Competición modificada.");
				}
			}while(repoCompetition.competicionDuplicada(newCompetition));
			competition.setName(nombre);
			competition.setDate(fecha);
			competition.setDescription(descripcion);
		}else {
			do {
				nombre = Utils.stringInput("Introduce a new name: ");
				descripcion = Utils.stringInput("Introduce a new description: ");
				do {
					fecha = Utils.stringInput("Introduce a new date: ");
				}while(!Utils.validaFecha(fecha));
				newCompetition.setName(nombre);
				newCompetition.setDate(fecha);
				newCompetition.setDescription(descripcion);
				if(repoCompetition.competicionDuplicada(newCompetition)) {
					Utils.showMessage("This competition already exists.");
				}else {
					Utils.showMessage("Competition updated.");
				}
			}while(repoCompetition.competicionDuplicada(newCompetition));
			competition.setName(nombre);
			competition.setDate(fecha);
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
		// TODO Auto-generated method stub
	}

	public Gimnast ejecutaMenuBuscarGimnasta() {
		// TODO Auto-generated method stub
		return null;
		
	}

	public Gimnast controlaMenuBuscarGimnasta(int option, Gimnast gimnast) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public void ejecutaMenuAccionesGimnasta() {
		// TODO Auto-generated method stub
		
	}

	public void controlaMenuAccionesGimnasta(int option) {
		// TODO Auto-generated method stub
		
	}

	public void ejecutaMenuModificarGimnasta() {
		// TODO Auto-generated method stub
		
	}
	
	
}
	


