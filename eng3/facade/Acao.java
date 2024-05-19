package facade;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Acao {
    private List<String> acoes = Arrays.asList("Correr", "Pular", "Nadar", "Voar");
    private Random random = new Random();

    public String getAcao() {
        int index = random.nextInt(acoes.size());
        return acoes.get(index);
    }
}
