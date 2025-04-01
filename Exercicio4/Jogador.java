package Exercicio4;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }


    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação foi aumentada em " + pontos + " pontos.");
            verificarNivel();
        } else {
            System.out.println("A pontuação deve ser um valor positivo.");
        }
    }

    private void verificarNivel() {
        if (pontuacao >= 100) {
            nivel++;
            pontuacao -= 100;
            System.out.println("Parabéns! Você subiu para o nível " + nivel + "!");
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}