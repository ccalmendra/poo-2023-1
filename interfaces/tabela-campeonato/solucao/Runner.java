
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

    public static void main(final String[] args) {

        List<Participante> participantes = new ArrayList<Participante>();

        Participante b = new Participante("Fogo");
        b.addVitorias(5);
        b.addGolsAFavor(21);

        Participante c = new Participante("Agua");
        c.addVitorias(4);
        c.addGolsAFavor(15);

        Participante d = new Participante("Terra");
        d.addVitorias(6);
        d.addGolsAFavor(33);

        participantes.add(b);
        participantes.add(c);
        participantes.add(d);
        
        Collections.sort(participantes);

        for(Participante p : participantes){
        	System.out.println(p.getResumo());
        }

        //... criacao dos objetos
        
        //... inclusao de valores
        
       
       
        // imprimir todas as linhas dos participantes

    }
}