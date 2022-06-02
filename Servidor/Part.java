package Servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface Part extends Remote{
	public void setCodigo(int cod) throws RemoteException;
	public void setNome(String nome) throws RemoteException;
	public void setDescricao(String descricao) throws RemoteException;
	public void setSubcomponente(List<subcomponente> sub) throws RemoteException;
	
}
