import java.util.ArrayList;
import java.util.List;

public class Basket<F extends Fruit>{

    private final List<F> fruits;

    public Basket(){
        fruits = new ArrayList<>();
    }

    public double getWeight(){
        double sum = 0;

        for (F fruit : fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void add (F fruit){
        fruits.add(fruit);
    }

    public int compare(Basket<? extends Fruit> other){
        return Double.compare(this.getWeight(), other.getWeight());
    }

    public static <U extends Fruit> void transferTo(Basket<? extends U> src, Basket<? super U> dst){
        dst.clear();
        dst.fruits.addAll(src.fruits);
        src.clear();
    }

    public void clear(){
        fruits.clear();
    }

    public int size(){
        return fruits.size();
    }
}
