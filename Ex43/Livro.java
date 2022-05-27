package Ex43;

public class Livro {
	private int id;
	private String livros;
	private int qtd;
	
	Livro(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLivros() {
		return livros;
	}
	public void setLivros(String Livros) {
		this.livros = livros;
	}
	public int getQntd() {
		return qtd;
	}
	public void setQntd(int qtd) {
		this.qtd = qtd;
	}
	
	public Livro(int id, int qtd, String livros) {
		this.id=id;
		this.qtd=qtd;
		this.livros=livros;
	}

		
	}

