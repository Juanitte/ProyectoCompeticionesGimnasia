package interfaces;

import model.Group;
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
	Group buscarGrupo(String name);
	boolean nombreDeGrupoDuplicado(String nombre); //Busca en el Set<Entry> de cada elemento del Set<Trial> de cada competicion del Set<Competition> del repositorio, comprobando solo las participaciones de grupos, si hay un nombre igual que el recibido.
}
