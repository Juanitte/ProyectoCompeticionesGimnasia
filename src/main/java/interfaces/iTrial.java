package interfaces;

import model.Entry;
import model.Trial;

public interface iTrial {

	<T> Entry<T> buscarParticipacion(int number);	//Aquí se buscará introduciendo el dorsal del participante.
	<T> Entry<T> getWinner();	//El método que se explica en el enunciado del proyecto.
	<T> boolean insertarParticipacion(Entry<T> entry);
	<T> void mostrarParticipaciones();
	<T> boolean horaDuplicada(Entry<T> participante);	//Aquí se controla que la hora recibida esté o no presente en el Set<Entry> de la Prueba.
}
