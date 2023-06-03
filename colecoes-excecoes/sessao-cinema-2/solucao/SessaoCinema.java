
import java.util.*;

public class SessaoCinema{

	String data;
	String horario;
	String filme;
	Map<String,Cliente> reservas;
	Set<String> assentosDisponiveis;

	public SessaoCinema(String data, String horario, 
							String filme){
		this.data = data;
		this.horario = horario;
		this.filme = filme;
		this.reservas = new HashMap<String,Cliente>();
		this.assentosDisponiveis = recuperarAssentosDisponiveis();
	}

	public Boolean reservar(String assento, 
								Cliente cliente){
		// assento esta disponivel?
		if(!this.assentosDisponiveis.contains(assento)){
			return false;
		}
		// assento ja possui reserva?
		if(reservas.containsKey(assento)){
			return false;
		}
		// cliente ja tem reserva para essa sessao?
		for(Cliente clienteComReserva : reservas.values()){
			if(clienteComReserva.getCpf()
								.equals(cliente.getCpf())){
				return false;
			}
		}
		// se todas as validacoes passaram, processa a reserva
		reservas.put(assento,cliente);
		return true;
	}

	public Boolean cancelar(String cpf){ 
		// percorre todas as entrada do mapa para achar o cliente com o cpf informado
		for(Map.Entry<String,Cliente> assentoReservado :
			reservas.entrySet())
		{
			// os valores do mapa sao objetos Cliente
			Cliente cliente = assentoReservado.getValue();
			if(cpf.equals(cliente.getCpf())){
				// as chaves do mapa são string com o codigo do assento
				String assento = assentoReservado.getKey(); 
				reservas.remove(assento);
				return true;
			}
		}
		return false; 
	}

	public String getMapaReservas(){
		// string que recebera todos os assentos reservados
		String retorno = "";
		// recupera todas chaves (assentos) para ordenar
		List<String> assentos = new ArrayList<>(reservas.keySet());
		// orderna os assentos por ordem alfabetica
		Collections.sort(assentos);
		// percorre o conjunto de assentos reservados para ler os dados de cada cliente
		for(String assentoReservado : assentos)
		{
			// recupera o Cliente do mapa
			Cliente cliente = reservas.get(assentoReservado);
			// monta a string com os assentos e os dados do cliente
			retorno += assentoReservado 
						+ " => " 
						+ cliente.getCpf()
						+ " / " + cliente.getTelefone()
						+ "\n";
		}

		return retorno;
	}

	private Set<String> recuperarAssentosDisponiveis(){

		// veja https://docs.oracle.com/en/java/javase/20/core/creating-immutable-lists-sets-and-maps.html
		Set<String> assentos = Set.of(
		"A05","A06","A07","A08","A09","A10","A11","A12","A13","A14","A15",
		"B01","B02","B0","B04",
		"B05","B06","B07","B08","B09","B10","B11","B12","B13","B14","B15",
		"B16","B17","B18","B19",
		"C01","C02","C0","C04",
		"C05","C06","C07","C08","C09","C10","C11","C12","C13","C14","C15",
		"C16","C17","C18","C19",
		"D01","D02","D0","D04",
		"D05","D06","D07","D08","D09","D10","D11","D12","D13","D14","D15",
		"D16","D17","D18","D19",
		"E01","E02","E0","E04",
		"E05","E06","E07","E08","E09","E10","E11","E12","E13","E14","E15",
		"E16","E17","E18","E19",
		"F01","F02","F0","F04",
		"F05","F06","F07","F08","F09","F10","F11","F12","F13","F14","F15",
		"F16","F17","F18","F19",
		"G01","G02","G0","G04",
		"G05","G06","G07","G08","G09","G10","G11","G12","G13","G14","G15",
		"G16","G17","G18","G19",
		"H01","H02","H0","H04",
		"H05","H06","H07","H08","H09","H10","H11","H12","H13","H14","H15",
		"H16","H17","H18","H19",
		"I01","I02","I0","I04",
		"I05","I06","I07","I08","I09","I10","I11","I12","I13","I14","I15",
		"I16","I17","I18","I19",
		"J01","J02","J0","J04",
		"J05","J06","J07","J08","J09","J10","J11","J12","J13","J14","J15",
		"J16","J17","J18","J19",
		"K01","K02","K0","K04",
		"K16","K17","K18","K19");

		return assentos;
		
		// por curiosidade, se quiser gerar a sequencia
		/*
		Set<String> assentos = new HashSet<>();
		List<String> filas = List.of("A","B","C","D","E","F","G","H","I","J","K");
		for(String fila : filas){
			List<String> colunas;
			if(fila.equals("A")){
				colunas = List.of("05","06","07","08","09","10","11","12","13","14","15");
			} else if (fila.equals("K")) {
				colunas = List.of("01","02","03","04","16","17","18","19");
			} else {
				colunas = List.of("05","06","07","08","09","10","11","12","13","14","15",
								  "01","02","03","04","16","17","18","19");
			}
			for(String coluna : colunas){
				assentos.add(fila+coluna);
			}
		} 
		return assentos;*/

	}

}