package interfaces;

import model.Entry;
import model.Trial;

public interface iTrial {

	Trial modificarPrueba();
	Entry buscarParticipacion(int number);	//Aquí se buscará introduciendo el dorsal del participante.
	Entry getWinner();	//El método que se explica en el enunciado del proyecto.
	boolean insertarParticipacion(Entry entry);
	void mostrarParticipaciones();
	boolean horaDuplicada(String hora);	//Aquí se controla que la hora recibida esté o no presente en el Set<Entry> de la Prueba.
}
