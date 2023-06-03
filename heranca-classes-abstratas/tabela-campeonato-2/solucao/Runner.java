
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
            // teste da tarefa T1
        	System.out.println(p);
        }
        
        // teste da tarefa T2
        System.out.println("b == b? " + b.equals(b));
        System.out.println("b == c? " + b.equals(c));
        System.out.println("b == new \"Fogo\"? " 
                            + b.equals(new Participante("Fogo")));
        System.out.println("b == string?" + b.equals("Fogo"));

    }
}