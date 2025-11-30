import java.util.ArrayList;
import java.util.List;

public class Basket<F extends Fruit>{

    private final List<F> array;

    public Basket(){
        array = new ArrayList<>();
    }

    public double getWeight(){
        double sum = 0;

        for (F fruit : array){
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void add (F fruit){
        array.add(fruit);
    }

    public int compare(Basket<? extends Fruit> other){
        return Double.compare(this.getWeight(), other.getWeight());
    }

    public void transferTo(Basket<? super F> dst){
        dst.clear();
        for (F fruit : array){
            dst.add(fruit);
        }
        clear();
    }

    public void clear(){
        array.clear();
    }

    public int size(){
        return array.size();
    }
}
