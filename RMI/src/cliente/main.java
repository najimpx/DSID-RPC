package cliente;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

import servidor.Peca;
import servidor.Repositorio;

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
    	System.out.println("Envie o nome da peca");
        Scanner scan = new Scanner(System.in);
        String nomePeca = scan.nextLine(); 
	    try
	    {
	    	
	    	Repositorio rep = (Repositorio) Naming.lookup("rmi://127.0.0.1:1099/"+nomePeca);
	    	
	    }
	    catch (Exception e)
	    {
	        System.out.println(e);
	    }
    }
}