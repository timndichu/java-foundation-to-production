public class Loops {

    public static void main(String args[]) {
        // switch case
        int num = 5;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }

        // while loop
        int i = 1;

        while (i<=5) {
            // System.out.println(i);
            i++;
        }

        //do while loop
        int j = 1;
        do {
            System.out.println("Do while " + j);
            j++;
        }while (j>=5);

        // for loop

        for (int k=0; k<4; k++) {
            System.out.println("For loop"+k);
        }

    }
}
