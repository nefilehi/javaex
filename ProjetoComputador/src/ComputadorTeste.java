import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Novo";
        computador1.cor = "Branca";
        computador1.numeroSerie = 123456;
        computador1.preco = 3500.00;
        //imprimir
        computador1.imprimir();
        //invocar metodo calcular valor
        computador1.calcularValor();
        //segundo imprimir pra sair com as alterações
        computador1.imprimir();
        //computador 2
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Preto";
        computador2.numeroSerie = 654321;
        computador2.preco = 2000.0;
        computador2.imprimir(); //primeira impressao
        computador2.calcularValor(); //calcular mudanças
        computador2.imprimir(); //segunda impressao
        //leitor da classe scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o novo valor do computador: ");
        //recebo um texto com o valor e converto para tipo double
        double valor = Double.parseDouble(leitor.nextLine());
        if(computador2.alterarValor(valor)){
            System.out.println("Preço alterado com sucesso");
        }
        else {
            System.out.println("Preço deve ser positivo");
        }
    }
}
