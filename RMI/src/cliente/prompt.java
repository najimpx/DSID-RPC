package cliente;

import java.rmi.Naming;
import java.rmi.RemoteException;

import servidor.Peca;
import servidor.Repositorio;

public class prompt {
	/*Faz o cliente se conectar a outro servidor e muda o repositorio corrente. Este comando
	recebe o nome de um repositorio e obtem do servico de nomes uma referencia para esse
	repositorio, que passa a ser o repositorio corrente.*/
	public Repositorio bind(String nomeRepositorio) {
		try {
		Repositorio corrente = (Repositorio) Naming.lookup("rmi://127.0.0.1:1099/"+nomeRepositorio);
		
		return corrente;
		}
        catch (Exception e)
        {
            System.out.println(e);
        }
		return null;
	}
	/*Lista as pecas do repositorio corrente*/
	public void listp(Repositorio rep) throws RemoteException{
		for(int i = 0; i<rep.listpart().length;i++) {
			System.out.println(rep.listpart()[i]);
		}
	}
	/*Busca uma peca por codigo. A busca e efetuada no repositorio corrente. Se encontrada,
	a peca passa a ser a nova peca corrente.*/
	public Peca getp(int codigo, Repositorio rep) throws RemoteException{
		rep.getp(codigo);
		return null;
	}
	/*Mostra atributos da peca corrente.*/
	public void showp(Repositorio rep) throws RemoteException {
		System.out.println("-----------Atributos da pessa corrente--------------------------");
		System.out.println("");
		String[] atributos = rep.showp();
		System.out.println("Nome da peca corrente: "+atributos[0]);
		System.out.println("");
		System.out.println("Descricao da peca corrente: "+atributos[1]);
		System.out.println("");
		System.out.println("Codigo da peca corrente: "+atributos[2]);
		System.out.println("");
		System.out.println("Quantidade de pecas da peca corrente: "+atributos[3]);
	}
	/* Esvazia a lista de sub-pecas corrente*/
	public void clearlist (Peca corrente) throws RemoteException{
	}
	/*Adiciona a lista de sub-pecas corrente n unidades da peca corrente*/
	public void addsubpart(Peca corrente, int quant) throws RemoteException{

	}
	/*Adiciona uma pe¸ca ao repositorio corrente. A lista de sub-pe¸cas corrente e usada como
lista de subcomponentes diretos da nova peca. (E so para isto que existe a lista de 
sub-pe¸cas corrente.)*/
	public void addp() {
		
	}
	/*Encerra a execucao do cliente*/
	public void quit() {
		 System.exit(0);
	}
}
