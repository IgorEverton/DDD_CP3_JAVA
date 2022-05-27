package Ex41;

public class Contato {
	private int id;
	private String numero;
	private String nome;
	
	
	Contato(){
		
	}
	
	public Contato(int id, String numero, String nome){
		this.id = id;
		this.numero = numero;
		this.nome = nome;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
}

