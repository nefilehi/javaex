package model;

import java.util.*;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();
    private ArrayList<String> Jogador = new ArrayList<>();
    private int ponto;

    public Baralho() {
        // Montar a lista com 52 cartas
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta); // Adiciona a carta
            }
        }
    }

    public void distribuirCartas() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quer uma carta? (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                embaralharCartas();
                Carta carta = cartas.remove(0);
                Jogador.add(carta.toString());
                System.out.println("Você recebeu: " + carta);
                ponto = calcularPontos();
                exibirCartas();
            } else {
                break;
            }
        }
    }

    public int calcularPontos() {
        int totalPontos = 0;

        for (Carta carta : cartas) {
            totalPontos += carta.getValor();
        }

        return totalPontos;
    }

    public void exibirCartas() {
        System.out.println("Cartas do jogador: " + Jogador);
        System.out.println("Pontos: ");
        System.out.println(ponto);
    }

    public void embaralharCartas() {
        Collections.shuffle(cartas); // Embaralhar
    }
}

