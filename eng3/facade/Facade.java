package facade;

public class Facade {
    private Acao acao = new Acao();
    private Nome nome = new Nome();
    private Idade idade = new Idade();

    public void funcAcao() {
        System.out.println("Ação: " + acao.getAcao());
    }

    public void funcIdade() {
        System.out.println("Idade: " + idade.getIdade());
    }

    public void funcNome() {
        System.out.println("Nome: " + nome.getNome());
    }
}
