package observer;

import java.util.ArrayList;
import java.util.List;

// Interface para os observadores
interface Observador {
    void update();
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
