package facade;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Nome {
    private List<String> nomes = Arrays.asList("Carlos", "Maria", "João", "Ana");
    private Random random = new Random();

    public String getNome() {
        int index = random.nextInt(nomes.size());
        return nomes.get(index);
    }
}
