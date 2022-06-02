package Cliente;
import Servidor.PartServidor;
import Servidor.Part;
import java.rmi.Naming;

public class prompt {
    public static void main(String[] args)
    {
        try
        {
            Part c = (Part) Naming.lookup("//127.0.0.1:1020/CalculatorService");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
