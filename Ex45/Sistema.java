package Ex45;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		int id;
		int opcao = 0;
		String nome;
		double preco;
		int quantidade;
		int qtdCompra;
		ArrayList<Produto> listaProduto = new ArrayList<>();
		ArrayList<ItemComprado> listaItem = new ArrayList<>();
		
		do {
			System.out.printf("Sistema de Pedidos\n\n");
			System.out.printf(	"1 - Cadastrar produto\n"
					+ 			"2 - Exibir produtos\n "
					+ 			"3 - Comprar produto\n"
					+ 			"4 - Sair\n\n");
			
			System.out.printf("DIgite a opção desejada: ");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				Produto p = new Produto();
				
				id = listaProduto.size() + 1;
				p.setId(id);
				
				
				System.out.printf("\nDigite o nome do produto: ");
                nome = ler.next();
                p.setNome(nome);
                
                System.out.printf("\nDigite o preço do produto: ");
                preco = ler.nextDouble();
                p.setPreco(preco);
                
                System.out.printf("\nDigite a quantidade do produto: ");
                quantidade = ler.nextInt();
                p.setQuantidade(quantidade);
                
                listaProduto.add(p);
                
                System.out.printf("Produto cadastrado com sucesso");
                System.in.read();
			}
                
			else if(opcao == 2) {
                	for(Produto a : listaProduto) {
                		System.out.printf("ID: %d - Nome: %s\n", a.getId(), a.getNome());
                	}
                }
			else if(opcao == 3) {
                	for(Produto a : listaProduto) {
                		System.out.printf("ID: %d - Nome: %s\n", a.getId(), a.getNome());
                	}
                	System.out.printf("Digite o id do produto que quer comprar");
                	id = ler.nextInt();
                	
                	System.out.printf("Digite a quantidade que quer comprar");
                	qtdCompra = ler.nextInt();
                	
                	
                	Produto pro = listaProduto.get(id-1);
                	pro.Comprar(qtdCompra);
                	
                	
                	
                	System.out.printf("Compra efetuada com sucesso");
                	System.in.read();
                }
			}while(opcao != 4);
		
	}
}
		

		

