
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean oncluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    //ficha tecnica
    //metodo -> void
    void exibeFichaTecnica() {
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //metodo -> double
    double pegaMedia() {

        //retorna a media
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}

