import java.util.ArrayList;
import java.util.List;

// Componente: interface comum para formas individuais e grupos de formas
interface Forma {
    void desenhar();
}


// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Criando formas individuais
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        // Criando grupo de formas e adicionando formas individuais
        GrupoDeFormas grupo = new GrupoDeFormas();
        grupo.adicionarForma(circulo);
        grupo.adicionarForma(quadrado);

        // Desenhando grupo de formas (que também desenha suas formas internas)
        grupo.desenhar();
    }
}
