import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExceptionHandling{
    public static void main(String[] args) throws IOException{
        int i = 40;
        int k = 33;
        int p = 0;
        int num = 0;
        BufferedReader bufferedReader = null;
        System.out.println("please input a number");

        try {
            // p = k/i;
            // // if(p==0) throw new ArithmeticException("no no nono");
            // if(p==0) throw new TimothyException("no no nono");
            InputStreamReader in = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(in);
            num = Integer.parseInt(bufferedReader.readLine());
            System.out.println(num);

        } 
        // catch (ArithmeticException e) {
            
        //     System.out.println("the issue is " + e);
        // }
        // catch (TimothyException e) {
            
        //     System.out.println("the timothy exception is " + e);
        // }
        catch (Exception e) {
            System.out.println("the exception is " + e);
        }
        finally {
            //this block is executed irrespective of whether or not we have exceptions
            //it is used when we want to close the resource e.g db connection or file processing
            bufferedReader.close();
        }

        
    }
}

class TimothyException extends Exception{
    public TimothyException(String str) {
        super(str);
    }
}