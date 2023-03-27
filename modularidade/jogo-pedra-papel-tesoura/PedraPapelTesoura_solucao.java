
// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Random.html
import java.util.Random;

//https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Scanner.html
import java.util.Scanner;

public class PedraPapelTesoura_solucao {
	
	static final int PEDRA = 0;
	static final int PAPEL = 1;
	static final int TESOURA = 2;
	
	static final int EMPATE = 0;
	static final int USUARIO_VENCEU = 1;
	static final int CPU_VENCEU = -1;
 
	static public void main(String[] args){
		System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
		int jogadaUsuario = recebeJogadaUsuario();
		int jogadaCpu = geraJogadaCpu();
		int resultado = executaJogada(jogadaUsuario, jogadaCpu);
		exibeResultado(jogadaUsuario, jogadaCpu, resultado);
	}
	
	static public int recebeJogadaUsuario(){
		Scanner sc = new Scanner(System.console().reader());
        return sc.nextInt();
	}
	
	static public int geraJogadaCpu(){
		Random rnd = new Random();
		long semente = System.currentTimeMillis();
		rnd.setSeed(semente);
		return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
	}
	
	static public int executaJogada(int jogadaUsuario, int jogadaCpu){
		int resultado;
		// checa se foi empate
		if(jogadaUsuario == jogadaCpu){
			resultado = EMPATE;
		}
		// checar se usuario venceu
		else if(((jogadaUsuario == PEDRA) && (jogadaCpu == TESOURA)) ||
				((jogadaUsuario == PAPEL) && (jogadaCpu == PEDRA)) ||
				((jogadaUsuario == TESOURA) && (jogadaCpu == PAPEL))) {
			resultado = USUARIO_VENCEU;
		}
		// senão, cpu venceu
		else {
			resultado = CPU_VENCEU;
		}
		return resultado;
	}
	
	static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
		switch(resultado){
			case EMPATE:
				System.out.println("voce = " + jogadaUsuario + " vs. cpu = " + jogadaCpu + " => EMPATE");
				break;
			case USUARIO_VENCEU:
				System.out.println("voce = " + jogadaUsuario + " vs. cpu = " + jogadaCpu + " => VENCEU");
				break;
			case CPU_VENCEU:
				System.out.println("voce = " + jogadaUsuario + " vs. cpu = " + jogadaCpu + " => PERDEU");
				break;
		}
	}
	
}
