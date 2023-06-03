public class Runner {

    public static void main(final String[] args) {

        SessaoCinema sessao = new SessaoCinema("27/04/2023", "15:30", "O Resgate do Programador Ryan");

        if(sessao.reservar("J05", new Cliente("111.222.333-44","9090-9090"))){
          System.out.println("01 OK");
        } else {
          System.out.println("01 ERRO - reserva deveria ser autorizada");
        }
        if(sessao.reservar("D09",new Cliente("222.333.111-44","8080-8080"))){
          System.out.println("02 OK");
        } else {
          System.out.println("02 ERRO - reserva deveria ser autorizada");
        }
        if(sessao.reservar("D09",new Cliente("000.222.333-44","9090-9090"))){
          System.out.println("03 ERRO - assento ja reservado");
        } else {
          System.out.println("03 OK");
        }
        if(sessao.reservar("H11",new Cliente("222.333.111-44","8080-8080"))){
          System.out.println("04 ERRO - reserva não deveria ser autorizada - cpf duplicado");
        } else {
          System.out.println("04 OK");
        }
        if(sessao.reservar("K08",new Cliente("555.222.333-44","7777-9090"))){
          System.out.println("05 ERRO - assento inexistente");
        } else {
          System.out.println("05 OK");
        }

        
        sessao.cancelar("222.333.111-44"); // assento D09 liberado
        if(sessao.reservar("D09",new Cliente("555.666.333-44","8888-8888"))){
          System.out.println("06 OK");
        } else {
          System.out.println("06 ERRO - reserva deveria ser aceita no assento livre");
        }

        sessao.reservar("F09",new Cliente("555.555.333-44","8844-8888"));

        String mapa = sessao.getMapaReservas();
        System.out.println("mapa de reservas:\n" + mapa);
       

    }
}
