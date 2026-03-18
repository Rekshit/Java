import java.util.*;

// ======================================================= ABSTRACT FACTORY ====================================================================

interface Product {
    void showproduct();
}

// CLOTHING

class MenClothing implements Product {
    public void showproduct() {
        System.out.println("Men Clothing Product Selected");
    }
}

class WomenClothing implements Product {
    public void showproduct() {
        System.out.println("Women Clothing Product Selected");
    }
}

class KidsClothing implements Product {
    public void showproduct() {
        System.out.println("Kids Clothing Product Selected");
    }
}


// FURNITURE

class WoodenFurniture implements Product {
    public void showproduct() {
        System.out.println("Wooden Furniture Selected");
    }
}

class PlasticFurniture implements Product {
    public void showproduct() {
        System.out.println("Plastic Furniture Selected");
    }
}

class GlassFurniture implements Product {
    public void showproduct() {
        System.out.println("Glass Furniture Selected");
    }
}


// MOBILE

class AppleMobile implements Product {
    public void showproduct() {
        System.out.println("Apple Mobile Selected");
    }
}

class SamsungMobile implements Product {
    public void showproduct() {
        System.out.println("Samsung Mobile Selected");
    }
}

class OppoMobile implements Product {
    public void showproduct() {
        System.out.println("Oppo Mobile Selected");
    }
}


// ABSTRACT FACTORY

abstract class AbstractFactory {
    abstract Product getProduct(int choice);
}

// Clothing Factory
class ClothingFactory extends AbstractFactory {
    Product getProduct(int choice) {
        if (choice == 1) return new MenClothing();
        else if (choice == 2) return new WomenClothing();
        else if (choice == 3) return new KidsClothing();
        return null;
    }
}

// Furniture Factory
class FurnitureFactory extends AbstractFactory {
    Product getProduct(int choice) {
        if (choice == 1) return new WoodenFurniture();
        else if (choice == 2) return new PlasticFurniture();
        else if (choice == 3) return new GlassFurniture();
        return null;
    }
}

// Mobile Factory
class MobileFactory extends AbstractFactory {
    Product getProduct(int choice) {
        if (choice == 1) return new AppleMobile();
        else if (choice == 2) return new SamsungMobile();
        else if (choice == 3) return new OppoMobile();
        return null;
    }
}

// Factory Producer
class FactoryProducer {
    static AbstractFactory getFactory(int choice) {
        if (choice == 1) return new ClothingFactory();
        else if (choice == 2) return new FurnitureFactory();
        else if (choice == 3) return new MobileFactory();
        return null;
    }
}


// ================================================= COMMAND PATTERN (PLACE OR CANCEL ORDER) ====================================================================

// Command Interface
interface Command {
    void execute();
}

class Order {
    void placeOrder() {
        System.out.println("Order Placed Successfully!");
    }

    void cancelOrder() {
        System.out.println("Order Cancelled!");
    }
}

// Concrete Command - Place Order
class PlaceOrderCommand implements Command {
    Order ord; 

    PlaceOrderCommand(Order ord) {
        this.ord = ord;
    }

    public void execute() {
        ord.placeOrder();
    }
}

// Concrete Command - Cancel Order
class CancelOrderCommand implements Command {
    Order ord; 

    CancelOrderCommand(Order ord) {
        this.ord = ord;
    }

    public void execute() {
        ord.cancelOrder();
    }
}

// Invoker
class OrderInvoker {
    Command cd;

    void setCommand(Command cd) {
        this.cd = cd;
    }

    void run() {
        if (cd != null) {
            cd.execute();
        } else {
            System.out.println("No command set!");
        }
    }
}

// ======================================================= STRATEGY PATTERN (PAYMENT) ====================================================================

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy strategy;

    void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void checkout(int amount) {
        strategy.pay(amount);
    }
}

// ======================================================== MAIN CLASS ====================================================================

public class Project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CATEGORY SELECTION 
        System.out.println("Choose Product Category:");
        System.out.println("1. Clothing");
        System.out.println("2. Furniture");
        System.out.println("3. Mobile");

        int category = sc.nextInt();

        AbstractFactory factory = FactoryProducer.getFactory(category);

        if (factory == null) {
            System.out.println("Invalid Category!");
            return;
        }

        // PRODUCT SELECTION 
        System.out.println("Choose Product:");

        if (category == 1) {
            System.out.println("1. Men  2. Women  3. Kids");
        } else if (category == 2) {
            System.out.println("1. Wooden  2. Plastic  3. Glass");
        } else if (category == 3) {
            System.out.println("1. Apple  2. Samsung  3. Oppo");
        }

        int productChoice = sc.nextInt();

        Product product = factory.getProduct(productChoice);

        if (product != null) {
            product.showproduct();
        } else {
            System.out.println("Invalid Product!");
            return;
        }

        //ORDER
        Order ord = new Order();
        OrderInvoker invoker = new OrderInvoker();

        System.out.println("1. Place Order");
        System.out.println("2. Cancel Order");
        
        int ch = sc.nextInt();
        
        if (ch == 1) {
            invoker.setCommand(new PlaceOrderCommand(ord));
        } 
        else if (ch == 2) {
            invoker.setCommand(new CancelOrderCommand(ord));
        } 
        else {
            System.out.println("Invalid Choice");
            return;
        }

        invoker.run();

        // PAYMENT 
        ShoppingCart cart = new ShoppingCart();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int paymentMode = sc.nextInt();
        int amount;

        if (paymentMode == 1) {
            cart.setStrategy(new CreditCardPayment());

            System.out.print("Enter CVV: ");
            sc.nextInt();

            System.out.print("Enter OTP: ");
            sc.nextInt();

        } else if (paymentMode == 2) {
            cart.setStrategy(new UpiPayment());
            sc.nextLine();

            System.out.print("Enter UPI ID: ");
            sc.nextLine();

            System.out.print("Enter Password: ");
            sc.nextLine();

        } else {
            System.out.println("Invalid Payment Option!");
            return;
        }

        System.out.print("Enter Amount: ");
        amount = sc.nextInt();

        cart.checkout(amount);

        System.out.println("\nOrder Placed Successfully!");

        sc.close();
    }
}