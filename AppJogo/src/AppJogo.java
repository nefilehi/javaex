import java.util.Scanner;

/**
 * @author Cauã Lima
 * @since Agosto 2024
 * Jogo da Adivinhação
 */

public class AppJogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int magico, palpite;

        // Número aleatório entre 1 e 1000

        magico = (int) (Math.random() * 1000) + 1;
        int cont = 0;
        do{
        System.out.println("Digite o palpite " + (cont+1) + " entre 1 e 999");

        palpite = Integer.parseInt(leitor.nextLine());
        cont++;

        // Verificando se acertou
        if (palpite == magico){
            System.out.println("Parabéns! Você acertou!");
            return;
        }else{
            if(palpite > magico){
                System.out.println("Seu palpite foi alto.");
            }else{
                System.out.println("Seu palpite foi baixo");
            }
        }
        if(cont == 10){
            System.out.println("GAME OVER!! O número era: " + magico );
            return;
        }
        }while(true);
    }
}
