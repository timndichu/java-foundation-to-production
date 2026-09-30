
public class ExceptionHandling{
    public static void main(String[] args) {
        int i = 40;
        int k = 33;
        int p = 0;

        try {
            p = k/i;
            // if(p==0) throw new ArithmeticException("no no nono");
            if(p==0) throw new TimothyException("no no nono");
        } catch (ArithmeticException e) {
            
            System.out.println("the issue is " + e);
        }
        catch (TimothyException e) {
            
            System.out.println("the timothy exception is " + e);
        }
        finally {
            //this block is executed irrespective of whether or not we have exceptions
        }

        
    }
}

class TimothyException extends Exception{
    public TimothyException(String str) {
        super(str);
    }
}