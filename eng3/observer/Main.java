package observer;

import java.util.ArrayList;
import java.util.List;

// Interface para os observadores
interface Observador {
    void update();
}

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

// Implementações concretas dos observadores
class Menu implements Observador {
    public void update() {
        System.out.println("Menu atualizado!");
    }
}

class BarraDeFerramentas implements Observador {
    public void update() {
        System.out.println("Barra de ferramentas atualizada!");
    }
}

class Dialogo implements Observador {
    public void update() {
        System.out.println("Diálogo atualizado!");
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Botao botao = new Botao();
        Observador menu = new Menu();
        Observador barraDeFerramentas = new BarraDeFerramentas();
        Observador dialogo = new Dialogo();

        botao.adicionarObservador(menu);
        botao.adicionarObservador(barraDeFerramentas);
        botao.adicionarObservador(dialogo);

        botao.clicar();
    }
}
