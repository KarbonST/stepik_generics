import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    public void testAddFruit() {
        Basket<Fruit> basket = new Basket<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        basket.add(apple);
        basket.add(orange);

        assertEquals(2, basket.size());
    }
    @Test
    public void testGetWeight() {
        Basket<Fruit> basket = new Basket<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        Fruit appleFruit = new Apple();
        Fruit orangeFruit = new Orange();
        basket.add(apple);
        basket.add(orange);
        basket.add(appleFruit);
        basket.add(orangeFruit);
        assertEquals(5, basket.getWeight());
    }
    @Test
    public void testEquals(){
        Basket<Fruit> basket1 = new Basket<>();
        Basket<Fruit> basket2 = new Basket<>();
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();
        Fruit fruit3 = new Apple();
        Fruit fruit4 = new Orange();
        Fruit fruit5 = new Apple();
        basket1.add(fruit1);
        basket2.add(fruit2);
        basket2.add(fruit4);
        basket1.add(fruit3);
        basket1.add(fruit5);

        assertEquals(0, basket1.compare(basket2));
    }

    @Test
    public void testMoreThan(){
        Basket<Fruit> basket1 = new Basket<>();
        Basket<Fruit> basket2 = new Basket<>();
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();
        Fruit fruit3 = new Apple();
        basket1.add(fruit1);
        basket1.add(fruit2);
        basket2.add(fruit3);

        assertEquals(1, basket1.compare(basket2));
    }

    @Test
    public void testLessThan(){
        Basket<Fruit> basket1 = new Basket<>();
        Basket<Fruit> basket2 = new Basket<>();
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();
        Fruit fruit3 = new Apple();
        basket2.add(fruit1);
        basket2.add(fruit2);
        basket1.add(fruit3);

        assertEquals(-1, basket1.compare(basket2));
    }

    @Test
    public void testTransferTo(){
        Basket<Fruit> basket1 = new Basket<>();
        Basket<Fruit> basket2 = new Basket<>();

        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();
        Fruit fruit3 = new Apple();
        basket1.add(fruit1);
        basket1.add(fruit2);
        basket1.add(fruit3);

        assertEquals(3, basket1.size());
        assertEquals(0, basket2.size());

        Basket.transferTo(basket1, basket2);
        assertEquals(3, basket2.size());
        assertEquals(0, basket1.size());
    }
}