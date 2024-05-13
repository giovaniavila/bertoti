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

// Logger (Singleton)
public class Logger {
    private static Logger instancia;
    
    private Logger() {
        // Construtor privado para evitar instanciacao externa
    }
    
    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }
    
    public void log(String mensagem) {
        System.out.println("Log: " + mensagem);
        // Implementacao para registrar logs
    }
}

// App
public class App {
    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstance();
        Logger logger = Logger.getInstance();
        
        configuracao.carregarConfiguracoes();
        logger.log("Iniciando aplicacao...");
        // Implementacao da aplicacao
    }
}
 {
    
}
