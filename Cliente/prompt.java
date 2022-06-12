package Cliente;
import Servidor.PartServidor;

import java.rmi.Naming;

import Interfaces.Part;

public class prompt {
    public static void main(String[] args)
    {
        try
        {
            Part c = (Part) Naming.lookup("//127.0.0.1:1020/part");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
