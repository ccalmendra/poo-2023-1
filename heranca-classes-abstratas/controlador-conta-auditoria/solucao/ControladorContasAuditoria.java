import java.time.LocalDateTime;

public class ControladorContasAuditoria extends ControladorContas {

	//Override
	public Boolean realizarSaque(String codigo, Double valor) {
		Boolean resultado = super.realizarSaque(codigo,valor);
		if(resultado){
			System.out.println(LocalDateTime.now() + 
							" saque da conta [" + codigo + 
							"] com valor R$ " + valor +
							" foi autorizado");
		} else {
			System.out.println(LocalDateTime.now() +
							" saque da conta [" + codigo + 
							"] com valor R$ " + valor +
							" NAO foi autorizado");
		}
		return resultado;
	}
	public Boolean realizarDeposito(String codigo, Double valor) {
		Boolean resultado = super.realizarDeposito(codigo,valor);
		if(resultado){
			System.out.println(LocalDateTime.now() +" deposito da conta [" + codigo + 
							"] com valor R$ " + valor +
							" foi autorizado");
		} else {
			System.out.println(LocalDateTime.now() + " deposito da conta [" + codigo + 
							"] com valor R$ " + valor +
							" NAO foi autorizado");
		}
		return resultado;
	}
	public Boolean realizarTransferencia(String codigoOrigem, String codigoDestino, Double valor) {
		Boolean resultado = super.realizarTransferencia(codigoOrigem,codigoDestino,valor);
		if(resultado){
			System.out.println(LocalDateTime.now() +" transf. da conta [" + codigoOrigem + 
							"] para conta [" + codigoDestino + "] com valor R$ " + valor +
							" foi autorizado");
		} else {
			System.out.println(LocalDateTime.now() + " transf. da conta [" + codigoOrigem + 
							"] para conta [" + codigoDestino + "] com valor R$ " + valor +
							" NAO foi autorizado");
		}
		return resultado;
	}
}