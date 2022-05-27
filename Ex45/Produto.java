package Ex45;

public class Produto {
	private int id;
	private String nome;
	private int quantidade;
	private double preco;
	private ItemComprado item;
	
	public ItemComprado getItem() {
		return item;
	}


	public void setItem(ItemComprado item) {
		this.item = item;
	}


	Produto(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto(int id, int quantidade, String nome, double preco){
		this.id=id;
		this.quantidade=quantidade;
		this.nome=nome;
		this.preco=preco;
	}
	public void Comprar(int qtdCompra) {
		quantidade = quantidade - qtdCompra;
	}



	}


	


	
		
	
	

