
// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Random.html
import java.util.Random;


public class PedraPapelTesoura {
	
	static final int PEDRA = 0;
	static final int PAPEL = 1;
	static final int TESOURA = 2;
 
	static public void main(String[] args){
		System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
		int jogadaUsuario = recebeJogadaUsuario();
		int jogadaCpu = geraJogadaCpu();
		int resultado = executaJogada(jogadaUsuario, jogadaCpu);
		exibeResultado(jogadaUsuario, jogadaCpu, resultado);
	}
	
	static public int recebeJogadaUsuario(){
		return 0;
	}
	
	static public int geraJogadaCpu(){
		Random rnd = new Random();
		long semente = System.currentTimeMillis();
		rnd.setSeed(semente);
		return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
	}
	
	static public int executaJogada(int jogadaUsuario, int jogadaCpu){
		return 0;
	}
	
	static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
		
	}
	
}
