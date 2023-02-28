package ejerciciosPOO2;

// Si ponemos el modificador final en una clase, no se podrá heredar de ella.
public class TiendaLicores extends Tienda{

	@Override
	public void bienvenida() {
		super.bienvenida();
		System.out.println("¡Si eres menor de 18 fuea de aquí!");
	}
}
