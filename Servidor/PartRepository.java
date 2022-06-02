package Servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface PartRepository extends Remote {
    public void insertPart(Part a) throws RemoteException;
    public Part RecoverPart(int cod) throws RemoteException;
    public List<Part> obterParts() throws RemoteException;
}
