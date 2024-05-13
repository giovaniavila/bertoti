package App;

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
