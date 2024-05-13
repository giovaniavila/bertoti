package observer;

// Classe Botao que será observada
class Botao {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void clicar() {
        System.out.println("Botão clicado!");
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.update();
        }
    }
}
