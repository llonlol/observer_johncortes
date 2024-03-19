package listas;

import java.util.ArrayList;
import java.util.List;

import interfaces.ientidad;

public class carrito {
	private List<ientidad> carrito = new ArrayList<>();	

	public void attachcarrito(ientidad producto) {
		this.carrito.add(producto);
	}
	
	public void detachhcarrito(ientidad producto) {
		this.carrito.remove(producto);
	}
	
	public void notifycarrito(String message) {
		for(ientidad producto : this.carrito) {
			producto.update(message);
		}
	}
	
	public int countcarrito() {
		return this.carrito.size();
	}
	
	public void emptycarrito() {
		this.carrito.clear();
	}

}