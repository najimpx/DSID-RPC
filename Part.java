import java.util.HashMap;	
import java.util.Map;
public interface Part {
	public int codigo = 0;
	public String nome = null;
	public String 	descricao = null;
	public Map<Part,Integer> subComp= new HashMap<Part,Integer>();
}
