import java.time.LocalDate;

public class GerenciarControleAluguel {

    public static void main(String[] args) {
        // Criando veículos
        Carro carro = new Carro();
        carro.setPlaca("ABC1234");
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2020);
        carro.setCor("Prata");
        carro.setNumeroPortas(4); // Atributo específico do Carro

        Moto moto = new Moto();
        moto.setPlaca("XYZ9876");
        moto.setMarca("Honda");
        moto.setModelo("CG");
        moto.setAno(2021);
        moto.setCor("Preto");
        moto.setCilindrada(160); // Atributo específico da Moto

        Caminhao caminhao = new Caminhao();
        caminhao.setPlaca("DEF5678");
        caminhao.setMarca("Volvo");
        caminhao.setModelo("FH");
        caminhao.setAno(2019);
        caminhao.setCor("Branco");
        caminhao.setCapacidadeCarga(12000);

        try {
            // Aluguel de Carro
            Aluguel aluguelCarro = new Aluguel();
            aluguelCarro.setVeiculo(carro); // Passa o objeto Carro para o aluguel
            aluguelCarro.setDataAluguel(LocalDate.now());
            aluguelCarro.setHoraAluguel();
            aluguelCarro.apresentarRegistroAluguel();

            // Espera 1 segundo antes de registrar a devolução
            Thread.sleep(1000);
            // Registrar devolução do carro
            aluguelCarro.setHoraDevolucao();
            aluguelCarro.apresentarRegistroAluguel(); // Apresenta novamente os dados, incluindo a devolução

            // Espera 1 segundo antes de registrar o próximo aluguel
            Thread.sleep(1000);

            // Aluguel de Moto
            Aluguel aluguelMoto = new Aluguel();
            aluguelMoto.setVeiculo(moto); // Passa o objeto Moto para o aluguel
            aluguelMoto.setDataAluguel(LocalDate.now());
            aluguelMoto.setHoraAluguel();
            aluguelMoto.apresentarRegistroAluguel();

            // Espera 1 segundo antes de registrar a devolução
            Thread.sleep(1000);
            // Registrar devolução da moto
            aluguelMoto.setHoraDevolucao();
            aluguelMoto.apresentarRegistroAluguel(); // Apresenta novamente os dados, incluindo a devolução

            // Espera 1 segundo antes de registrar o próximo aluguel
            Thread.sleep(1000);

            // Aluguel de Caminhão
            Aluguel aluguelCaminhao = new Aluguel();
            aluguelCaminhao.setVeiculo(caminhao); // Passa o objeto Caminhão para o aluguel
            aluguelCaminhao.setDataAluguel(LocalDate.now());
            aluguelCaminhao.setHoraAluguel();
            aluguelCaminhao.apresentarRegistroAluguel();

            // Espera 1 segundo antes de registrar a devolução
            Thread.sleep(1000);
            // Registrar devolução do caminhão
            aluguelCaminhao.setHoraDevolucao();
            aluguelCaminhao.apresentarRegistroAluguel(); // Apresenta novamente os dados, incluindo a devolução

        } catch (InterruptedException e) {
            System.err.println("Ocorreu uma interrupção: " + e.getMessage());
        }
    }
}
