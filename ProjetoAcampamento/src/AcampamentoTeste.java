public class AcampamentoTeste {
    public static void main(String[] args) {
        //criar objeto chamado menbro
        Acampamento membro = new Acampamento();
        membro.nome = "Joãozinho";
        membro.idade = 16;
        //invocar o metodo imprimir
        membro.imprimir();
        //executar o metodo separarGrupo
        membro.separarGrupo();

        membro.imprimir();
    }
}
