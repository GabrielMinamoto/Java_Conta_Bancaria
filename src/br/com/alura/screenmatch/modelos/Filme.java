package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean oncluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //getters
    //atalho-> alt+insert
    //botao direito+generate+setters
    //gera automaticamente
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isOncluidoNoPlano() {
        return oncluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    //método acessor

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //SETTERS
    //atalho-> alt+insert
    //botao direito+generate+setters
    //gera automaticamente
    //se clicar control+click em cima do nome da classe, ele te redireciona para a classe no main
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setOncluidoNoPlano(boolean oncluidoNoPlano) {
        this.oncluidoNoPlano = oncluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //ficha tecnica
    //metodo -> void
    public void exibeFichaTecnica() {
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //metodo -> double
    public double pegaMedia() {

        //retorna a media
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}

