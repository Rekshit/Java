import java.util.Scanner;

// Product 1
interface Chair {
    void make();
}

// Product 2
interface Table {
    void make();
}

// ===== Modern Furniture =====
class ModernChair implements Chair {
    public void make() {
        System.out.println("Making Modern Chair");
    }
}

class ModernTable implements Table {
    public void make() {
        System.out.println("Making Modern Table");
    }
}

// ===== Victorian Furniture =====
class VictorianChair implements Chair {
    public void make() {
        System.out.println("Making Victorian Chair");
    }
}

class VictorianTable implements Table {
    public void make() {
        System.out.println("Making Victorian Table");
    }
}

// ===== Abstract Factory =====
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

// ===== Concrete Factories =====
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Table createTable() {
        return new VictorianTable();
    }
}

// ===== Main Class =====
public class AbstractFactoryPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Furniture Style:");
        System.out.println("1. Modern");
        System.out.println("2. Victorian");

        int choice = sc.nextInt();

        FurnitureFactory factory = null;

        if (choice == 1) {
            factory = new ModernFurnitureFactory();
        } else if (choice == 2) {
            factory = new VictorianFurnitureFactory();
        } else {
            System.out.println("Invalid Choice!");
            System.exit(0);
        }

        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.make();
        table.make();

        sc.close();
    }
}