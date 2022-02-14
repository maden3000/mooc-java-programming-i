
import java.util.ArrayList;

/**
 *
 * @author glitch
 */
public class Package {

    private ArrayList<Gift> lista;

    public Package() {
        this.lista = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.lista.add(gift);
    }

    public int totalWeight() {
        int tot = 0;
        for (Gift sing: lista) {
            tot += sing.getWeight();
        }
        return tot;
    }
}
