import model.Funcionario;

import javax.swing.*;

public class GerenciarFuncionarios {
    List<Funcionario> funcionarios;

    public GerenciarFuncionarios(){
        funcionarios= new ArrayList<>();
        //começar uma lista vazia
    }

    public void  execCunsultar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser consultado: ");
        String rgProc = scanner.nextLine();
        //varrer a lista a procura do rgProc
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                System.out.println(funcionario.listar());
                return;
            }
        }
        System.out.println("Funcionario não encontrado");
    }

    public static void main(String[] args) {
        GerenciarFuncionarios gerenciar = new GerenciarFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; //opção do menu
        do{
            System.out.println("Menu de operações");
            System.out.println("1. Cadastrar");
            System.out.println("2. consultar");
            System.out.println("3. Bonificar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = interger.parseint(scanner.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execCunsultar();
                    break;
                case 3:
                    gerenciar.execBonificar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
        }while(opcao != 9);
    }

    public void execBonificar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser bonificado: ");
        String rgProc = scanner.nextLine();
        //varrer a lista para encontrar o funcionario a ser bonificado
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                double aumento;
                System.out.println("Digite o valor do aumento: ");
                aumento = Double.parseDouble(scanner.nextLine());
                funcionario.bonificar(aumento);
                System.out.println("Funcionario bonificado com sucesso");
                return;
            }
        }
        System.out.println("Funcionario não encontrado");
    }

    public void execCadastrar(){
        //pedir os dados para o usuario
        //criar um objeto funcionario e atribuir esses dados
        //em seguida colocar na lista
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Digite o departamento do funcionario: ");
        funcionario.setDepartamento(scanner.nextLine());
        System.out.println("Digite o RG do funcionario: ");
        funcionario.setRg(scanner.nextLine());
        System.out.println("Digite o salário do funcionario: ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.println("Funcionario cadastrado com sucesso");
        funcionarios.add(funcionario); //adicionei o funcionario na lista
    }

}
