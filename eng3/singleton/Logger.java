package singleton;

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