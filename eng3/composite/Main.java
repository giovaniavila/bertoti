import java.util.ArrayList;
import java.util.List;

// Componente: interface comum para formas individuais e grupos de formas
interface Forma {
    void desenhar();
}

// Folha: forma individual
class Circulo implements Forma {
    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}

// Folha: outra forma individual
class Quadrado implements Forma {
    public void desenhar() {
        System.out.println("Desenhando um quadrado");
    }
}

// Composite: grupo de formas
class GrupoDeFormas implements Forma {
    private List<Forma> formas = new ArrayList<>();

    public void adicionarForma(Forma forma) {
        formas.add(forma);
    }

    public void removerForma(Forma forma) {
        formas.remove(forma);
    }

    public void desenhar() {
        for (Forma forma : formas) {
            forma.desenhar();
        }
    }
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
