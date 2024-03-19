package main;
import entidades.entidad;
import listas.carrito;
import listas.inventario;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int select = -1;
		int cant=-1;
		int invt=-1;
		int valor=0;
		inventario inventario=new inventario();
		carrito pedido = new carrito();

		entidad producto1 = new entidad("papas",1000);
		entidad producto2 = new entidad("helado",2000);
		
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto1);
		inventario.attachinventario(producto2);
		inventario.attachinventario(producto2);
		inventario.attachinventario(producto2);
		inventario.attachinventario(producto2);
		inventario.attachinventario(producto2);
		inventario.attachinventario(producto2);
		
		while(select != 0){
			invt=inventario.countinventario();
			System.out.println("hay " +invt+" unidades disponibles para compra!");
			System.out.println("carrito:\n1.- comprar papas" +
					"\n2.- comprar helado\n" +
					"3.- pagar\n" +
					"0.- salir");
			select = Integer.parseInt(scanner.nextLine()); 


			switch(select){
			case 1: 
				pedido.attachcarrito(producto1);
				inventario.detachhinventario(producto1);
				cant=pedido.countcarrito();				
				System.out.println("hay " +cant+ " productos en el carrito:");
				pedido.notifycarrito("está en el carrito");
				inventario.countinventario();
				valor+=producto1.getvalue();
				break;
			case 2: 
				pedido.attachcarrito(producto2);
				inventario.detachhinventario(producto2);
				cant=pedido.countcarrito();				
				System.out.println("hay " +cant+ " productos en el carrito:");
				pedido.notifycarrito("está en el carrito");
				inventario.countinventario();
				valor+=producto2.getvalue();
				break;
			case 3: 
				System.out.println("su compra se ha realizado correctamente!");
				pedido.notifycarrito("va en camino");
				System.out.println("total a pagar: $"+valor);
				pedido.emptycarrito();
				select=0;
				break;
			case 0: 
				System.out.println("adios vuelva pronto!");
				break;
			default:
				System.out.println("número no reconocido");
				break;
			}

		}


	}

}








