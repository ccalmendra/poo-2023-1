
import java.util.*;

public class Historico {

	public List<String> anteriores = new ArrayList<>();
	public List<String> posteriores = new ArrayList<>();
	String urlAtual = "home";

	public void visitar(String url){
		anteriores.add(0, this.urlAtual);
		posteriores.clear();
		this.urlAtual = url;
	}
	public String avancar(){
		if(!posteriores.isEmpty()){
			anteriores.add(0,this.urlAtual);
			this.urlAtual = posteriores.remove(0);
			return this.urlAtual;
		}
		return null;
	}
	public String voltar(){
		if(!anteriores.isEmpty()){
			posteriores.add(0,this.urlAtual);
			this.urlAtual = anteriores.remove(0);
			return this.urlAtual;
		}
		return null;
	}
}