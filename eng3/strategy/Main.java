package strategy;
// Interface para as estratégias de ataque
// O padrão Strategy permite que um objeto altere seu comportamento dinamicamente, definindo uma família de algoritmos encapsulados e tornando-os intercambiáveis.
interface EstrategiaAtaque {
    void atacar();
}

// Implementações concretas das estratégias de ataque
class AtaqueCorporal implements EstrategiaAtaque {
    public void atacar() {
        System.out.println("Ataque corporal!");
    }
}

class AtaqueMagico implements EstrategiaAtaque {
    public void atacar() {
        System.out.println("Ataque mágico!");
    }
}

class AtaqueFurtivo implements EstrategiaAtaque {
    public void atacar() {
        System.out.println("Ataque furtivo!");
    }
}

// Classe Personagem que utiliza a estratégia de ataque
class Personagem {
    private EstrategiaAtaque estrategiaAtaque;

    public Personagem() {
        // Estratégia padrão
        this.estrategiaAtaque = new AtaqueCorporal();
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        this.estrategiaAtaque = estrategia;
    }

    public void atacar() {
        this.estrategiaAtaque.atacar();
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem();
        guerreiro.atacar(); // Saída: Ataque corporal

        guerreiro.setEstrategiaAtaque(new AtaqueMagico());
        guerreiro.atacar(); // Saída: Ataque mágico

        guerreiro.setEstrategiaAtaque(new AtaqueFurtivo());
        guerreiro.atacar(); // Saída: Ataque furtivo
    }
}
