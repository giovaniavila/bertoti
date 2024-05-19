package singleton;

public class Login {
    private static Login instance;
    private boolean logado;

    private Login() {
        
    }

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public void entrar() {
        if (!logado) {
            logado = true;
            System.out.println("Usuário entrou no sistema.");
        } else {
            System.out.println("Usuário já está logado.");
        }
    }

    public void sair() {
        if (logado) {
            logado = false;
            System.out.println("Usuário saiu do sistema.");
        } else {
            System.out.println("Usuário já está deslogado.");
        }
    }
}
