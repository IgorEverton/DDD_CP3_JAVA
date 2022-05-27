package Ex42;



public class Agenda {
	private int quancont;
	private Contato contatoagenda;
	
	Agenda(){
		
	}
	Agenda(int quancont, Contato contatoagenda){
		this.quancont = quancont;
		this.contatoagenda = contatoagenda;
	}
	
	public void setQuancont(int quancont) {
		this.quancont = quancont;
	}
	public int getQuancont() {
		return quancont;
	}
	public void setContatoagenda(Contato contatoagenda) {
		this.contatoagenda = contatoagenda;
	}
	public Contato getContatoagenda() {
		return contatoagenda;
	}
}