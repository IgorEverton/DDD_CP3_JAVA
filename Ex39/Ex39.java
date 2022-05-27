package Ex39;

import java.util.Scanner;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;
public class Ex39 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		int opcao;
		int id;
		int idade;
		String nome, agencia;
		String numero = null;
		
		
		do {        
            System.out.printf("===> Sistema de Cadastro Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf(	"1 - Cadastrar Cliente \n" +
            					"2 - Exibir Clientes \n" +
                    			"3 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
  				
  
            if (opcao == 1) {
            	Cliente c = new Cliente();
     
            	id = listaClientes.size() + 1;
            	c.setId(id);
     
            	System.out.printf("\nDigite o nome do cliente: ");
            	nome = ler.next();
            	c.setNome(nome);
            	
            	System.out.printf("\nDigite a idade do cliente: ");
            	nome = ler.next();
            	c.setNome(nome);
  
            	
            	ContaBancaria cb = new ContaBancaria();
            	
            	cb.setAgencia("4422");
            	
            	cb.setNumero(numero);
            
          
      listaClientes.add(c);
      System.out.printf("Cliente incluído com sucesso!");
      System.in.read();
            }
            else if (opcao == 2) {
            	for (Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Idade: %d - Conta: \n", c.getId(), c.getNome(), c.getIdade(), c.getConta());
            		System.in.read();
            	}
            }

            
		}while(opcao == 3);
			ler.close();
		
		
			
	}

}
