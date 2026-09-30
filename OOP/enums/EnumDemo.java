
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
            case Status.Failed:
                System.out.println("Try again");
                break;
            case Status.Running:
                System.out.println("All good");
                break;
            case Status.Pending:
                System.out.println("in queue awaiting");
                break;
            case Status.Success:
                System.out.println("Completed");
                break;
            default:
                break;
        }

    }
}

enum Status {
    Running, Failed, Pending, Success
}