package facade;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Idade {
    private List<String> idades = Arrays.asList("20", "25", "30", "35");
    private Random random = new Random();

    public String getIdade() {
        int index = random.nextInt(idades.size());
        return idades.get(index);
    }
}
