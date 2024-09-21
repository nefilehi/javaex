package model;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    //construtor
    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + "de " + naipe;
    }
}