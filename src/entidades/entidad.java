package entidades;
import interfaces.ientidad;

public class entidad implements ientidad{
	private String name;
	private int value;
	
	public entidad(String name, int value) {
		this.name = name;
		this.value= value;
	}
	
	@Override
	public void update(String message) {
		System.out.println(this.name +" "+ message);
	}
	
	public int getvalue() {
		return this.value;
	}
	
	public int getname() {
		return this.value;
	}
}