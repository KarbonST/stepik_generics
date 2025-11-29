
void main() {
    Fruit apple1 = new Apple();
    Fruit apple2 = new Apple();
    Fruit orange1 = new Orange();
    Fruit orange2 = new Orange();
    List<Apple> array = new ArrayList<>();
    array.add(apple1);

    Basket<Apple> fruitBasket = new Basket<>(array);
}
