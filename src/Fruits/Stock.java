package Fruits;

public class Stock {
    public static void main(String[] args) {
        Box<Orange> orangebox1 = new Box<>();
        Box<Orange> orangebox2 = new Box<>();
        Box<Apple> applebox1 = new Box<>();
        Box<Apple> applebox2 = new Box<>();

        orangebox1.addFruit(new Orange(), 5);
        orangebox2.addFruit(new Orange(), 7);
        applebox1.addFruit(new Apple(), 8);
        applebox2.addFruit(new Apple(), 6);
        System.out.println(applebox1);
        System.out.println(orangebox1.getWeight());
        orangebox1.compare(orangebox2);
        System.out.println(orangebox1.compare(orangebox2));
        orangebox1.pourOver(orangebox2);
        System.out.println(orangebox1.getWeight());
    }
}
