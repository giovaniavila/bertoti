package composite;

// Composite: grupo de formas
class GrupoDeFormas implements Forma {
    private List<Forma> formas = new ArrayList<>();

    public void adicionarForma(Forma forma) {
        formas.add(forma);
    }

    public void removerForma(Forma forma) {
        formas.remove(forma);
    }

    public void desenhar() {
        for (Forma forma : formas) {
            forma.desenhar();
        }
    }
}