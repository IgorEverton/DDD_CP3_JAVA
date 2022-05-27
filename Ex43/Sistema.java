package Ex43;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;


public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		ArrayList<Livro> listaLivros = new ArrayList<>();
		
		int opcao;
		int id;
		int qtd = 0;
		String status;
		String nome;
		String livros;
		String tel;
		Emprestimo emprestimos;
		Livro livro;
		
		do {
			System.out.printf(	"1 - Cadastrar Pessoa \n "
					+ 			"2 - Cadastrar Livro \n "
					+ 			"3 - Fazer Empréstimo \n "
					+ 			"4 - Devolução de Livros \n "
					+ 			"5 - Sair \n");
			
			System.out.printf("\n Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Pessoa pessoa = new Pessoa();
				
				id = listaPessoas.size()+1;
				pessoa.setId(id);
				
				System.out.printf("Digite o nome da pessoa: ");
				nome = ler.next();
				pessoa.setNome(nome);
				
				System.out.printf("Digite o telefone de contato: ");
				tel = ler.next();
				pessoa.setTel(tel);
				
				System.out.printf("nNOME: %s \nTELEFONE: %s",nome, tel);
				listaPessoas.add(pessoa);
				System.in.read();
		}	if (opcao == 2) {
				Livro l = new Livro();
			
				id = listaLivros.size()+1;
				l.setId(id);
			
				System.out.printf("Digite o nome do livro: ");
				livros = ler.next();
				l.setLivros(livros);
			
				System.out.printf("Digite a quantidade de livros: ");
				qtd = ler.nextInt();
				l.setQntd(qtd);
			
				System.out.printf("ID: %d \nNOME DO LIVRO: %s \n QUANTIDADE: %d", id, livros, qtd);
				listaLivros.add(l);
				System.in.read();
	}		if(opcao == 3) {
				
				System.out.printf("Digite o seu id: ");
				id = ler.nextInt();
				
				Pessoa pessoa = listaPessoas.get(id - 1);
				
				for (Livro l : listaLivros) {
					System.out.printf("ID: %d \nNOME DO LIVRO: %s \n QUANTIDADE: %d", l.getId(), l.getLivros(), l.getQntd());
				}
				System.out.printf("Digite o ID do livro que deseja pegar: ");
				id = ler.nextInt();
				
				Livro l = listaLivros.get(id - 1);
				System.out.printf("Emprestimo realizado com sucesso");
				
				System.in.read();
	}		if(opcao == 4) {
				for(Livro l: listaLivros) {
					System.out.printf("ID: %d \nNOME DO LIVRO: %s \n QUANTIDADE: %d", l.getId(), l.getLivros(), l.getQntd());
		}
				System.out.printf("Digite o ID do livro que quer devolver: ");
				id=ler.nextInt();
				
				Livro l = listaLivros.get(id + 1);
				
				System.out.printf("Livro devolvido com sucesso");
				
				System.in.read();
	}

			}while(opcao != 5);
}
}