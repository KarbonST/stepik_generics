import java.io.Serializable;
import java.util.List;

public class Box<T extends Number & Comparable<T> & Serializable> {
    private T[] array;

    @SafeVarargs
    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg(){
        double result = 0;
        for (T element: array){
            result += element.doubleValue();
        }

        return result / array.length;
    }

    public int compare(Box<?> another){
        return Double.compare(avg(), another.avg());
    }

    public static <U> U getFirstElement(List<U> list){
        return list.getFirst();
    }

    public static <U> void transfer(List<? extends U> src, List <? super U> dst){
        dst.addAll(src);
        src.clear();
    }
}
