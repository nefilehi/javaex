import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objeto para usar a ContaTeste
        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar Conta");
            System.out.println("2.. Consultar Conta");
            System.out.println("3.. Depositar na Conta");
            System.out.println("4.. Sacar da Conta");
            System.out.println("9.. Finalizar Programa");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execDepositar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        cc.cliente = sc.nextLine();
        System.out.println("Digite a agencia do cliente: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite a conta do cliente: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o saldo do cliente: ");
        cc.saldo = Double.parseDouble(sc.nextLine());

    }
    public void execConsultar(){
    cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado da conta: ");
        double valor = Double.parseDouble(sc.nextLine());
        if (cc.sacar(valor)){
            System.out.println("Valor sacado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void execDepositar(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado da conta: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
    }

}
