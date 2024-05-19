package mvc;

public class ControllerAdmin implements ControllerInterface {
    private View view;
    private Model model;

    public ControllerAdmin(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void notificar() {
        // Implementação para notificar observadores
    }

    @Override
    public void salvar() {
        // Implementação para salvar dados
    }
}

