import java.util.ArrayList;
import java.util.List;

public class Basket<F extends Fruit>{

    private List<? extends Fruit> array;
    public Basket(List<? extends Fruit> array) {
        this.array = array;
    }
}
