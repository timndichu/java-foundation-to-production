
public class ExceptionHandling{
    public static void main(String[] args) {
        int i = 0;
        int k = 33;

        try {
            int p = k/i;
        } catch (Exception e) {
            
            System.out.println(e);
        }

        
    }
}
