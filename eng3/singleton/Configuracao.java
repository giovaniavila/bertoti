package singleton;

public // Configuracao (Singleton)
public class Configuracao {
    private static Configuracao instancia;
    
    private Configuracao() {
        // Construtor privado para evitar instanciacao externa
    }
    
    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }
    
    public void carregarConfiguracoes() {
        System.out.println("Carregando configuracoes...");
        // Implementacao para carregar configuracoes
    }
}
