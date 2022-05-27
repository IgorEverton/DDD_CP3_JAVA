package Ex43;

public class Pessoa {
	private String nome ;
	private int id;
	private String tel;
	private Emprestimo emprestimos;
	
	Pessoa(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Emprestimo getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(Emprestimo emprestimos) {
		this.emprestimos = emprestimos;
	}
	public Pessoa (String nome , int id , String tel, Emprestimo emprestimos) {
		this.nome = nome ;
		this.id = id;
		this.tel = tel;
		this.emprestimos = emprestimos;
	}
}
