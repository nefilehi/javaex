import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
    // Atributos
    private int idAluguel;
    private Veiculo veiculo;
    private LocalDate dataAluguel;
    private LocalDateTime horaAluguel;
    private LocalDateTime horaDevolucao;

    // Métodos
    public void setDataAluguel(LocalDate data) {
        this.dataAluguel = data;
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
        this.veiculo = veiculo;
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
