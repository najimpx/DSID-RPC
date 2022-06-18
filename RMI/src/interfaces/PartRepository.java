package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PartRepository extends Remote{
    
    public static final String end = "rmi://127.0.0.1:1099/";
    
    
    //public void criaPart(String nome, String descricao)throws RemoteException;
    
    public String[] listpart()throws RemoteException;
    
    public boolean addSubPart(String[] subsParts)throws RemoteException;
    
    public String getp(int codigo)throws RemoteException;
    
    public boolean addp(String nome)throws RemoteException;
    
    public String[] showp()throws RemoteException;
    
    public boolean ClearList()throws RemoteException;
}
