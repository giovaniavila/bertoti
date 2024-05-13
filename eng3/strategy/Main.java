package strategy;
// Interface para as estratégias de ataque
// O padrão Strategy permite que um objeto altere seu comportamento dinamicamente, definindo uma família de algoritmos encapsulados e tornando-os intercambiáveis.
interface EstrategiaAtaque {
    void atacar();
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
