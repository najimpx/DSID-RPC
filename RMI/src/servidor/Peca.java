package servidor;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

import interfaces.Part;
import interfaces.PartRepository;

public class Peca extends UnicastRemoteObject implements Part {
    
    
    
    public int codigo;
    public String nome;
    public String descricao;
    public List<String> subComp;
    public int quant;
    
    
    protected Peca() throws RemoteException {
	
	super();
	// TODO Auto-generated constructor stub
    }

    
    public void criaPart(String nome, String descricao) throws RemoteException {
	try {
	    Naming.bind(nome, this);
	} catch (MalformedURLException | RemoteException | AlreadyBoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	this.codigo = nome.concat(descricao).hashCode();
	this.nome = nome;
	this.descricao = descricao;
	this.subComp = new LinkedList<>();
	this.quant = 0;
    }




    @Override
    public boolean addSubPart(String nome) throws RemoteException {
	if(verificaNome(nome)) {
	    this.subComp.add(nome);
	    this.quant++;
	    return true;
	}
	return false;
    }


    @Override
    public int getCodigo() throws RemoteException {
	// TODO Auto-generated method stub
	return this.codigo;
    }


    @Override
    public String getNome() throws RemoteException {
	// TODO Auto-generated method stub
	return this.nome;
    }


    @Override
    public String getDescricao() throws RemoteException {
	// TODO Auto-generated method stub
	return this.descricao;
    }


    @Override
    public List<String> getSubcomponente() throws RemoteException {

	return this.subComp;
    }


    @Override
    public int getQuant() throws RemoteException {
	// TODO Auto-generated method stub
	return this.quant;
    }





    private boolean verificaNome(String nome) {
	
	String[] rep;
	
	try {
	    rep= Naming.list(this.nome);
	} catch (RemoteException | MalformedURLException e) {
	    return false;
	}

	for (int j = 0; j < rep.length; j++) {
	    if(nome == rep[j])
		break;
	    if(j == rep.length-1)
		return false;
	    }
	
	
	return true;
    }


    @Override
    public void apagaLista() throws RemoteException {
	this.subComp.clear();
	
    }






   
    

}
