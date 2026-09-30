
public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Failed;
        int ordinal = s.ordinal();

        Status ss[] = Status.values();

        System.out.println(s + " " + ordinal);

        for (Status m : ss) {
            System.out.println(m);
        }

        switch (s) {
            case Failed:
                System.out.println("Try again");
                break;
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("in queue awaiting");
                break;
            case Success:
                System.out.println("Completed");
                break;
            default:
                break;
        }

        Laptop mac = Laptop.Macbook;
        System.out.println(mac.getPrice());

        for(Laptop lap : Laptop.values()) {
             System.out.println(lap + " "  + lap.getPrice());
        }
    }
}

enum Status {
    Running, Failed, Pending, Success
}

enum Laptop {
    Macbook(2000), HP(1200), XPS(2300), Surface;

    private int price;
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Laptop() {
        
    }

    Laptop(int price) {
        this.price = price;
    }
}