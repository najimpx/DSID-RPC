package Servidor;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class PartServidor implements PartRepository {
	// Cada servidor implementara um objeto PartRepository
    public void insertPart(Part a) throws RemoteException
    {
        return;
    }
    public List<Part> obterParts() throws RemoteException{
    	List<Part> Parts = new ArrayList<Part>();
    	return Parts;
    }
    public Part RecoverPart(int cod) throws RemoteException{
    	Part p = new Peca();
    	return p;	
    }
    		
    PartServidor()
    {
    	
        try
        {
            Part c = new Peca();
            
            Naming.rebind("RMI://127.0.0.1:1020/parts", c);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new PartServidor();
    }
}
