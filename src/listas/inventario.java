package listas;

import java.util.ArrayList;
import java.util.List;

import interfaces.ientidad;

public class inventario {
	private List<ientidad> inventario = new ArrayList<>();

	
	public void attachinventario(ientidad producto) {
		this.inventario.add(producto);
	}
	
	public void detachhinventario(ientidad producto) {
		this.inventario.remove(producto);
	}
	
	public void notifyinventario(String message) {
		for(ientidad producto : this.inventario) {
			producto.update(message);
		}
	}
	
	public int countinventario() {
		return this.inventario.size();
	}
}