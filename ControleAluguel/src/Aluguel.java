import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {

    // Atributos
    private int idAluguel;
    private Veiculo veiculo; // Será inicializado ao setar um Veículo
    private LocalDate dataAluguel;
    private LocalDateTime horaAluguel;
    private LocalDateTime horaDevolucao;

    // Métodos
    public void setDataAluguel() {
        this.dataAluguel = LocalDate.now();
        System.out.println("Data do aluguel registrada: " + this.dataAluguel);
    }

    public void setHoraAluguel() {
        this.horaAluguel = LocalDateTime.now(); // Define a hora atual
        System.out.println("Hora do aluguel registrada: " + this.horaAluguel);
    }

    public void setHoraDevolucao() {
        this.horaDevolucao = LocalDateTime.now(); // Define a hora atual
        System.out.println("Hora da devolução registrada: " + this.horaDevolucao);
    }

    // Método para apresentar o registro do aluguel e devolução
    public void apresentarRegistroAluguel() {
        if (veiculo == null) {
            System.out.println("Nenhum veículo foi alugado.");
            return;
        }

        System.out.println("Informações do veículo alugado:");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Cor: " + veiculo.getCor());

        // Verifica qual tipo de veículo foi alugado
        if (veiculo instanceof Carro) {
            System.out.println("Número de portas: " + ((Carro) veiculo).getNumeroPortas());
        } else if (veiculo instanceof Moto) {
            System.out.println("Cilindrada: " + ((Moto) veiculo).getCilindrada());
        } else if (veiculo instanceof Caminhao) {
            System.out.println("Capacidade de carga: " + ((Caminhao) veiculo).getCapacidadeCarga() + " kg");
        }

        // Apresentar a hora da devolução, se disponível
        if (horaDevolucao != null) {
            System.out.println("Hora da devolução: " + horaDevolucao);
        } else {
            System.out.println("Veículo ainda não foi devolvido.");
        }
    }

    // Getters e Setters
    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo; // Inicializa o veículo corretamente
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getHoraAluguel() {
        return horaAluguel;
    }

    public void setHoraAluguel(LocalDateTime horaAluguel) {
        this.horaAluguel = horaAluguel;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }
}
