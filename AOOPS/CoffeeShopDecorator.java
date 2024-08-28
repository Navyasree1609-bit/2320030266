// CoffeeShopDecorator.java

// BeverageComponent.java
interface BeverageComponent {
    String getDescription();
    double cost();
}

// Espresso.java
class Espresso implements BeverageComponent {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

// CondimentDecorator.java
abstract class CondimentDecorator implements BeverageComponent {
    protected BeverageComponent beverage;

    public CondimentDecorator(BeverageComponent beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}

// Milk.java
class Milk extends CondimentDecorator {
    public Milk(BeverageComponent beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}

// Main method to demonstrate the usage of the Decorator Pattern
public class CoffeeShopDecorator {
    public static void main(String[] args) {
        BeverageComponent beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
