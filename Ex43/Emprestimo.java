package Ex43;

public class Emprestimo {
	private String status;
	private Livro livro;
	
	Emprestimo(){
		
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Emprestimo(String status, Livro livro) {
		this.status=status;
		this.livro=livro;
	}
	
}