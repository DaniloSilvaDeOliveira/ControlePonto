public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        ControlePonto controlePonto = new ControlePonto();
        //gerente
        Gerente danilo = new Gerente();
        danilo.setLogin("danilos");
        danilo.setSenha("danilos123");
        danilo.setDocumento("123123123123");
        danilo.setNome("danilo");
        danilo.setIndFunc(1);
        //secretaria
        Secretaria juliana = new Secretaria();
        juliana.setRamal("21");
        juliana.setTelefone("19 91092379");
        juliana.setDocumento("1231121232123");
        juliana.setNome("juliana");
        juliana.setIndFunc(2);
        //operadora
        Operador luma = new Operador();
        luma.setValorHora(100.50);
        luma.setDocumento("1231651232123");
        luma.setNome("luma");
        luma.setIndFunc(3);

        //imprimindo os pontos
        Thread.sleep(1000);
        System.out.println(controlePonto.registraEntrada(danilo));
        Thread.sleep(1000);
        System.out.println(controlePonto.registraEntrada(luma));
        Thread.sleep(1000);
        System.out.println(controlePonto.registraEntrada(juliana));
        //imprimindo os pontos de saida
        Thread.sleep(1000);
        System.out.println(controlePonto.registrarSaida(danilo));
        Thread.sleep(1000);
        System.out.println(controlePonto.registrarSaida(luma));
        Thread.sleep(1000);
        System.out.println(controlePonto.registrarSaida(juliana));

    }
}