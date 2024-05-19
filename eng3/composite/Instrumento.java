public class Instrumento extends Component {
    private String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInstrumento() {
        System.out.println("Instrumento: " + getNome());
    }
}
