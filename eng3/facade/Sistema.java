package facade; 

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
