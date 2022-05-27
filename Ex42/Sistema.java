package Ex42;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

		public static void main(String[] args) throws IOException {
			Scanner ler = new Scanner(System.in);
			ArrayList<Contato> listaContatos = new ArrayList<>();
			
			int opcao = 0;
			int id;
			int qtdCont;
			int i = 0;
			String numero, nome;
			do {
				System.out.printf("===> Sistema de cadastro telefonico<==");
				System.out.printf("Escolha uma opção:\n");
				System.out.printf(	"1 - Incluir Contato \n" +
						      		"2 - Atualizar Contato\n" +
						          	"3 - Excluir Contato \n" +
						            "4 - Exibir Contatos \n" +
						            "5 - Sair\n\\n");
				System.out.printf("Digite a opção desejada: ");
				opcao = ler.nextInt();
				
				if (opcao == 1) {
					Contato contato = new Contato();
					 id = listaContatos.size() + 1;
					 contato.setId(id);
					 
					 System.out.printf("\nDigite o nome do contato: ");
					 nome = ler.next();
					 contato.setNome(nome);
					 
					 System.out.printf("Será cadastrado quantos números neste contato?");
					 qtdCont = ler.nextInt();
					 
					 while (i < qtdCont) {
						 System.out.printf("\nDigite o número do contato: ");
						 numero = ler.next();
						 contato.setNumero(numero);
						 i = i + 1;
					 }
					 listaContatos.add(contato);
					 
					 System.out.printf("\nContato adicionado com sucesso!");
					 System.in.read();
					 
				}
				else if(opcao == 2) {
					for(Contato a: listaContatos) {
						System.out.printf("Id: %d - Nome: %s - Número: %s\n", a.getId(), a.getNome(), a.getNumero());
					}
					System.out.printf("\nDigite o id do contato que deseja Alterar: ");
					id = ler.nextInt();
					
					System.out.printf("Digite o novo nome do contato: ");
					nome = ler.next();
					
					System.out.printf("Digite o novo número do contato: ");
					numero = ler.next();
					
					Contato contato = listaContatos.get(id-1);
					
					contato.setNome(nome);
					contato.setNumero(numero);
					
					System.out.printf("Contato atualizado com sucesso!");
					System.in.read();
				}
				
				else if(opcao == 3) {
					for(Contato a: listaContatos) {
						System.out.printf("Id: %d - Nome: %s - Número: %s\n", a.getId(), a.getNome(), a.getNumero());
					}
					System.out.printf("\nDigite o id do contato para exclusão: ");
					id = ler.nextInt();
					
					listaContatos.remove(id-1);
					
					System.out.printf("Contato excluido com sucesso!");
					System.in.read();
					
				}
				else if(opcao == 4) {
					for(Contato a: listaContatos) {
						System.out.printf("Id: %d - Nome: %s - Número: %s\n", a.getId(), a.getNome(), a.getNumero());
					}
					System.in.read();
				}
				
			}while(opcao != 5);

		}

	}
