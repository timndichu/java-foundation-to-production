public class Strings {
    public static void main(String[] args) {
        String name = "tim";

        String name2 = new String("Thomas");

        // System.out.println(name + " " + name2);

        // System.out.println(name.charAt(0));
        name.concat(" is a friend");
        System.out.println(name.concat(name));

        String s1 = "Timothy";
        String s2 = "Timothy";

        // System.out.print(s1==s2);

        // StringBuffer

        StringBuffer sb = new StringBuffer("this is ");
        sb.append("my story");
        System.out.println(sb);
    }
}
