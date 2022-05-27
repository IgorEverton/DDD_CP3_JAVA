package Ex40;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;
public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		int opcao;
		int id;
		int idade;
		String nome, agencia;
		double valor;
		
		do {        
            System.out.printf("===> Sistema de Cadastro de Alunos <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf(	"1 - Criar cliente \n" +
            					"2 - Fazer Deposito \n" +
            					"3 - Fazer saques \n" +
            					"4 - Fazer transferencia \n" +
                    			"5 - Consultar saldo\n" +
            					"6 - Consultar Extrato \n" +
                    			"7 - Sair\n\n");
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
            	idade = ler.nextInt();
            	c.setIdade(idade);
  
            	
            	ContaBancaria cb = new ContaBancaria();
            	
            	cb.setAgencia("4422");
            	
            	
            	int n = rand.nextInt(1000);
            	cb.setNumero(Integer.toString(n));
            	
            	cb.setLimite(75);
     
            	ArrayList<String> e = new ArrayList<>();
            	cb.setExtrato(e);
            	
            	c.setConta(cb);
            	
            	listaClientes.add(c);
            	
            	System.out.printf("Cliente incluído com sucesso!");
            	
            	System.in.read();
  }		
            else if (opcao == 2) {
            	for(Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Número da Conta: %s - Saldo: %f \n", c.getId(), c.getNome(), c.getConta().getNumero(), c.getConta().getSaldo());
            	}
            	System.out.printf("\nDigite o id do Cliente que deseja depositar: ");
            	id = ler.nextInt();
            	
            	System.out.printf("Digite o valor do deposito: ");
             	valor = ler.nextDouble();
            	
            	Cliente cli = listaClientes.get(id-1);
            	
            	cli.getConta().Depositar(valor);
            	
            	System.out.printf("Deposito realizado com sucesso!");
            	
            	System.in.read();
            }
            else if ( opcao == 3) {
            	for(Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Número Conta: %s", c.getId(), c.getNome(), c.getConta(), c.getConta().getNumero());
            	}
            	System.out.printf("\nDigite o id do Cliente que deseja sacar: ");
            	id = ler.nextInt();
            	
            	System.out.printf("Digite o valor do saque: ");
            	valor = ler.nextDouble();
            	
            	Cliente cli = listaClientes.get(id-1);
            	
            	cli.getConta().Depositar(valor);
            	
            	System.out.printf("Saque realizado com sucesso!");
            	
            	System.in.read();
            }
            else if ( opcao == 4) {
            	for(Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Número Conta: %s", c.getId(), c.getNome(), c.getConta(), c.getConta().getNumero());
            	}
            	System.out.printf("\nDigite o id do Cliente emissor: ");
            	id = ler.nextInt();
            	
            	Cliente cliEmissor = listaClientes.get(id-1);
            	
            	System.out.printf("\nDigite o id do Cliente destinatario: ");
            	id = ler.nextInt();
            	
            	Cliente cliDestinatario = listaClientes.get(id-1);
            	
            	System.out.printf("Digite o valor da transferencia: ");
            	valor = ler.nextDouble();
            	
            	cliEmissor.getConta().Transferir(valor, cliDestinatario);
            	
            	System.out.printf("Transfência realizada com sucesso!");
            	
            	System.in.read();
            	
            	
            }
            else if ( opcao == 5) {
            	for(Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Número Conta: %s", c.getId(), c.getNome(), c.getConta(), c.getConta().getNumero());
            	}
            	System.out.printf("\nDigite o id do Cliente que deseja consultar o saldo: ");
            	id = ler.nextInt();
            	
            	Cliente cli = listaClientes.get(id-1);
            	
            	cli.getConta().ConsultarSaldo();
            	
            	System.out.printf("Saldo: %f", cli.getConta().ConsultarSaldo());
            	
            	System.in.read();

		}
            else if (opcao == 6) {
            	for (Cliente c: listaClientes) {
            		System.out.printf("ID: %d - Nome: %s - Número Conta: %s", c.getId(), c.getNome(), c.getConta(), c.getConta().getNumero());
            	}
            	System.out.printf("\nDigite o id do Cliente que deseja consultar o extrato: ");
            	id = ler.nextInt();
            	
            	Cliente cli = listaClientes.get(id-1);
            	
            	System.out.printf("Saldo: %f", cli.getConta().consultarExtrato());
            	
            	System.in.read();
            }
		}while(opcao != 7);
		
		
		}
}

