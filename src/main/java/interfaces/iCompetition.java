package interfaces;

import model.Trial;
import model.DTO.Category;
import model.DTO.Gadget;
import model.DTO.Type;

public interface iCompetition {
	//La clase competición deberá llevar un int que será el nº de dorsal por el que va,
	//ya que hay que usar un autoincrementador pero individual para cada competición.
	//Así se podrá llevar una cuenta del dorsal que toca poner al siguiente participante en cada competición.
	void mostrarPruebas();
	boolean pruebaDuplicada(Trial trial);
	boolean agregarPrueba(Trial trial);
	Trial buscarPrueba(Type type, Category category, Gadget gadget);
}
