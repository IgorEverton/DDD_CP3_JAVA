package Ex45;

public class ItemComprado {
	private int id;
	private Produto produto;
	private int qtd;
	
	ItemComprado(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public ItemComprado(int id, int qtd, Produto produto) {
		this.id=id;
		this.qtd=qtd;
		this.produto=produto;
	}

		
	}
	

