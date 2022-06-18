package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

import interfaces.Part;
import interfaces.PartRepository;

public class Repositorio extends UnicastRemoteObject implements PartRepository {
    
    
    List<Part> parts;
    String partCorrente;
    
    protected Repositorio() throws RemoteException {
	
	super();
	this.parts = new LinkedList<>();
	
    }

    

    @Override
    public String[] listpart() throws RemoteException {
	String[] lista = new String[this.parts.size()];
	for (int i = 0; i < lista.length; i++) {
	    lista[i] = this.parts.get(i).getNome();
	}
	return lista;
    }

    @Override
    public boolean addSubPart(String[] subsParts) throws RemoteException {
	
	try {
	    Peca p = (Peca)Naming.lookup(PartRepository.end.concat(this.partCorrente));
	    for (int i = 0; i < subsParts.length; i++) {
		p.addSubPart(subsParts[i]);
	    }
	    return true;
	    	
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return false;
    }

    @Override
    public String getp(int codigo) throws RemoteException {
	String[] rep;
	
	try {
	    rep= Naming.list(this.partCorrente);
	} catch (RemoteException | MalformedURLException e) {
	    return null;
	}
	int aux=0;
	for (int j = 0; j < rep.length; j++) {
	    if(rep[j].hashCode() == codigo) {
		aux=j;
		break;
	    }
		
	    if(j == rep.length-1)
		return null;
	    }
	
	

	return rep[aux];
    }

    @Override
    public boolean addp(String nome) throws RemoteException {
	Peca p;
	try {
	    p = (Peca)Naming.lookup(PartRepository.end.concat(nome));
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
	    return false;
	}
	this.parts.add(p);
	return true;
    }

    @Override
    public String[] showp() throws RemoteException {
	String[] rtn = new String[4];
	try {
	    Peca p = (Peca)Naming.lookup(PartRepository.end.concat(this.partCorrente));
	    rtn[0]=p.getNome();
	    rtn[1]=p.getDescricao();
	    rtn[2]=""+p.getCodigo();
	    rtn[3]=""+p.getQuant();
		
	    
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
	    return null;
	}
	
	return rtn;
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean ClearList() throws RemoteException {
	try {
	    Peca p = (Peca)Naming.lookup(PartRepository.end.concat(this.partCorrente));
	    p.apagaLista();
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
	    return false;
	}
	return true;
    }
    
   

}
