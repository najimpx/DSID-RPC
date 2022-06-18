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
	    	prompt promp = new prompt();
	    	System.out.println("");
	    	System.out.println("-----------------------------Lista de comandos----------------------------------------");
	    	System.out.println("--------------------------------------------------------------------------------------");
	    	System.out.println("b (se conecta a outro servidor e muda o repositorio corrente)");
	    	System.out.println("");
	    	System.out.println("l (Lista as pecas do repositorio corrente)");
	    	System.out.println("");
	    	System.out.println("s (Mostra atributos da peca corrente)");
	    	System.out.println("");
	    	System.out.println("g (Escreve nome da peca a se tornar peca corrente)");
	    	System.out.println("");
	    	System.out.println("c (Esvazia a lista de sub-pecas corrente )");
	    	System.out.println("");
	    	System.out.println("a (Adiciona a lista de sub-pecas corrente n unidades da peca corrente)");
	    	System.out.println("");
	    	System.out.println("d (Adiciona uma peca ao repositorio corrente)");
	    	System.out.println("");
	    	System.out.println("q");
	    	System.out.println("Encerra a execucao do cliente");
	        char comando = scan.next().charAt(0); 
	        boolean loop = true;
	        while(loop) {
		        switch(comando) {
		        	case 'b':
		        		break;
		        	case 'l':
		        		break;
		        	case 's':
		        		break;
		        	case 'g':
		        		break;
		        	case 'c':
		        		break;
		        	case 'a':
		        		break;
		        	case 'd':
		        		break;
		        	case 'q':
		        		promp.quit();
		        		break;
		        	default:
		        		System.out.println("comando invalido");
		        }
	        }
	    }
	    catch (Exception e)
	    {
	        System.out.println(e);
	    }
    }
}