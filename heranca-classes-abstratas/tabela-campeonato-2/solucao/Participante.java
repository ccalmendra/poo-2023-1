
import java.lang.Comparable;

public class Participante implements Comparable<Participante>{
	String nome;
	private Integer vitorias, empates, derrotas, golsAFavor, golsContra;

	public int compareTo(Participante outro){
		if(this.vitorias > outro.vitorias){
			return -1;
		} else if (this.vitorias < outro.vitorias) {
			return 1;
		}
		return 0;
	}

	public Participante(String n){
		nome = n;
		vitorias = empates = derrotas = golsAFavor = golsContra = 0;
	}
	public String getNome(){
		return this.nome;
	}
	public void addVitorias(Integer v){
		this.vitorias += v;
	}
	public void addDerrotas(Integer d){
		this.derrotas += d;
	}
	public void addEmpates(Integer e){
		this.empates += e;
	}
	public void addGolsAFavor(Integer gf){
		this.golsAFavor += gf;
	}
	public void addGolsAContra(Integer gc){
		this.golsContra += gc;
	}
	// implementacao da tarefa T1
	public String toString(){
		return this.nome + ", " + 
				this.vitorias + ", " +
				this.derrotas + ", " +
				this.empates + ", " +
				this.golsAFavor + ", " +
				this.golsContra;
	}
	// implementacao da tarefa T2
	public boolean equals(Object outro){

		if(this == outro) return true;

		if(outro instanceof Participante){
			if(this.nome.equals(((Participante)outro).getNome())){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	} 
}