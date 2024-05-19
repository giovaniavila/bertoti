import java.util.ArrayList;
import java.util.List;

public class Musico extends Component {
    private String nome;
    private List<Component> components = new ArrayList<>();

    public Musico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void mostrarInstrumento() {
        System.out.println("Músico: " + getNome());
        for (Component component : components) {
            component.mostrarInstrumento();
        }
    }
}
