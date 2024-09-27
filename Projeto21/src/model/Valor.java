package model;

public enum Valor {
    As(1),
    Dois(2),
    Tres(3),
    Quatro(4),
    Cinco(5),
    Seis(6),
    Sete(7),
    Oito(8),
    Nove(9),
    Dez(10),
    Valete(10),
    Dama(10),
    Reis(10);

    private final int valor;

    Valor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
