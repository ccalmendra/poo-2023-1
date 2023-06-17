
public class Runner {

	public static void main(String[] args){

		Historico hist = new Historico();

		// historico vazio ao inicializar
		if(hist.voltar() != null)
		{
			System.out.println("erro historico nao vazio");
		}

		hist.visitar("url1");
		System.out.println("url1\nanterior = " + hist.anteriores + "\n"
							+"posterior = " + hist.posteriores);
		
		if(hist.voltar() != "home")
		{
			System.out.println("erro url home esperada");
		}

		hist.visitar("url2");
		hist.visitar("url3");
		System.out.println("url2 e 3\nanterior = " + hist.anteriores + "\n"
							+"posterior = " + hist.posteriores);

		if(hist.voltar() != "url2") {
			System.out.println("erro: url2 esperada");
		}
		System.out.println("voltar\nanterior = " + hist.anteriores + "\n"
							+"posterior = " + hist.posteriores);

		if(hist.avancar() != "url3"){
			System.out.println("erro: url3 esperada");
		}
		System.out.println("avancar\nanterior = " + hist.anteriores + "\n"
							+"posterior = " + hist.posteriores);

	}

}