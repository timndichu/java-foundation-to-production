// package type_conversion_casting;

class TypeConversion {
    public static void main(String[] args) {
        byte b = 23;
        int a = 258;
        b = (byte)a;

        System.out.print(b);

        //type promotion
        byte a1 = 44;
        byte a2 = 55;

        int res = a1*a2;
         System.out.print(res);
    }
}
