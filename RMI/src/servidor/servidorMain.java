import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        
        while(1) {
	    	System.out.println("");
	    	System.out.println("------------------------------------Comandos-------------------------------------");
	    	System.out.println("'i' = Iniciar o servidor");
	    	System.out.println("---------------------------------------------------------------------------------");
	        char comando = scan.next().charAt(0); 
	        System.out.println("");
		    
	        switch(comando) {
		       	case 'i':
		        	System.out.println("Escolha o nome do servidor:");
		            Scanner scan = new Scanner(System.in); 
		            String nomeRepository = scan.nextLine(); 
		            System.out.println("Iniciando servidor...");
		            CalculatorServer obj = new CalculatorServer();
		            Naming.rebind(nomeRepository, obj);
		            // cria um repositorio
		            Repositorio repositorio = new Repositorio();
		            
		            System.err.println(“Servidor pronto...”);
		        	break;
	
		        default:
		        	System.out.println("Comando invalido. Tente outro comando.");
	        }
		    
        
      
       
        
        
	}

}
