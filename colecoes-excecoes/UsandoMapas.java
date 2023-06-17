
import java.util.*;

public class UsandoMapas{

	public static void main(String[] args){

		// exemplo de mapa (veiculo -> proprietario)
		Map<String,String> veiculos = new HashMap<>();

		veiculos.put("abc1234","111.111.111-11");
		veiculos.put("abc9999","111.111.111-11");
		System.out.println("veiculos contem chave = abc9999 " 
							+ veiculos.containsKey("abc9999"));
		veiculos.put("abc9999","222.222.222-22");
		System.out.println("veiculos contem dono = 333.333.333-33 " 
							+ veiculos.containsValue("333.333.333-33"));
		System.out.println("ja tem? " + veiculos.putIfAbsent("abc1234","111.111.111-22"));

		for(Map.Entry<String,String> registro : veiculos.entrySet()){
			System.out.println("> " + registro.getKey() + " = " + registro.getValue());
		}

		// exemplo de mapa (proprietario -> lista de veiculos)
		Map<String,List<String>> proprietarios = new HashMap<>();

		proprietarios.put("111.111.111.11",List.of("qwe-2222"));
		proprietarios.put("222.222.111.11",List.of("qwe-0000","rty-9999","uio-0909"));

		System.out.println("get = " + proprietarios.get("222.222.111.11"));

		for(Map.Entry<String,List<String>> registro : proprietarios.entrySet()){
			System.out.println("> " + registro.getKey() + 
								" = " + registro.getValue());
		}

	}

}