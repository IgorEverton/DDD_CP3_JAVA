package Ex45;
import java.util.ArrayList;
public class Pedido {
	private int id;
	private Cliente cliente;
	private ArrayList<ItemComprado> itemComprado;
	
	public ArrayList<ItemComprado> getItemComprado() {
		return itemComprado;
	}
	public void setItemComprado(ArrayList<ItemComprado> itemComprado) {
		this.itemComprado = itemComprado;
	}
	Pedido(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pedido(int id, Cliente cliente) {
		this.id=id;
		this.cliente=cliente;
	}
}
