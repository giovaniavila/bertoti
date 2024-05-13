// SubsistemaLogin
class SubsistemaLogin {
    public void login(String usuario, String senha) {
        System.out.println("Realizando login do usuário: " + usuario);
    }
}

// SubsistemaGerenciamentoUsuarios
class SubsistemaGerenciamentoUsuarios {
    public void adicionarUsuario(String nome) {
        System.out.println("Adicionando usuário: " + nome);
    }
}

// SubsistemaProcessamentoPagamentos
class SubsistemaProcessamentoPagamentos {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento no valor de: " + valor);
    }
}

// Fachada (Facade)
class Sistema {
    private SubsistemaLogin subsistemaLogin;
    private SubsistemaGerenciamentoUsuarios subsistemaGerenciamentoUsuarios;
    private SubsistemaProcessamentoPagamentos subsistemaProcessamentoPagamentos;

    public Sistema() {
        this.subsistemaLogin = new SubsistemaLogin();
        this.subsistemaGerenciamentoUsuarios = new SubsistemaGerenciamentoUsuarios();
        this.subsistemaProcessamentoPagamentos = new SubsistemaProcessamentoPagamentos();
    }

    public void operacaoSimplificada(String usuario, String senha, String nomeNovoUsuario, double valorPagamento) {
        subsistemaLogin.login(usuario, senha);
        subsistemaGerenciamentoUsuarios.adicionarUsuario(nomeNovoUsuario);
        subsistemaProcessamentoPagamentos.processarPagamento(valorPagamento);
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.operacaoSimplificada("usuario", "senha", "novoUsuario", 100.0);
    }
}
