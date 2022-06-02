package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;

//Cada peca sera representada por um objeto cuja interface e Part.
public class Peca extends UnicastRemoteObject implements Part
{
	int codigo;
	String nome;
	String descricao;
	List<subcomponente> ex = new ArrayList<subcomponente>();

    protected Peca() throws RemoteException
    {
        super();
    }
	public void setCodigo(int cod) throws RemoteException{
		codigo = cod;
		return;
	}
	public void setNome(String pecaNome) throws RemoteException {
		nome = pecaNome;
		return;
	}
	public void setDescricao(String desc) throws RemoteException {
		descricao = desc;
		return;
	}
	public void setSubcomponente(List<subcomponente> sub) throws RemoteException{
		ex  = sub;
		return;
	}


}