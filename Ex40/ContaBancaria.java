package Ex40;

import java.util.ArrayList;

import Ex39.Cliente;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	private ArrayList<String> extrato;
	private double limite;

	public ContaBancaria(String agencia, String numero, double saldo, double limite, ArrayList<String> extrato) {
		this.agencia=agencia;
		this.numero=numero;
		this.saldo=saldo;
		this.limite=limite;
		this.extrato=extrato;
	}
	
	public ContaBancaria() {
		
	}
public String getAgencia() {
	return agencia;
}
public void setAgencia(String agencia) {
	this.agencia = agencia;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public double getSaldo() {
	return saldo;
}

public ArrayList<String> getExtrato() {
	return extrato;
}
public void setExtrato(ArrayList<String> extrato) {
	this.extrato = extrato;
}
public double getLimite() {
	return limite;
}
public void setLimite(double limite) {
	this.limite = limite;
}
public void Depositar(double valorDeposito) {
	saldo = saldo + valorDeposito;
	extrato.add("Depósito +$" + valorDeposito);
	
}
public void Sacar(double valorSaque) {
	saldo -= valorSaque;
	extrato.add("Saque +$" + valorSaque);
}
public void Transferir(double valorTransf, Cliente destinatario) {
	//Sacar(valorTransf);
	//destinatario.getConta().Depositar(valorTransf);
	saldo -= valorTransf;
	extrato.add("Transferencia -$" + valorTransf + "para" + destinatario.getNome());
	destinatario.getConta().saldo += valorTransf;
	destinatario.getConta().getExtrato().add("Transferência +$" + valorTransf);
}
	
public double ConsultarSaldo() {
	return saldo;
}
public String consultarExtrato() {
	String texto = "";
	for(String operacao: extrato) {
		texto += operacao + "\n";
	}
	return texto;
}


	
}

	