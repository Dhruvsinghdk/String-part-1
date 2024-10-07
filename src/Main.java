

public class Main {
    public static void main(String[] args) {
       String n = new String("Helllo ");
       String a = n.concat("world");
        System.out.println(a);

        String n1 = new String("Hello");
        String n2 = new String("hello");
//        System.out.println(n1.equalsIgnoreCase(n2));
        String s = "hello";
        System.out.println(n2 == s);


        String s1 = "hello";
        System.out.println(s==s1);

        System.out.println(n1+n2);
        System.out.println("hello"+"world");

        String n3 = "helloworld";

        String s6 = "hello";
        String s7 = s6+"world";
        System.out.println(s7);


        final String s8 = "hello";
        String s9 = s8 + "world";

        System.out.println(n3 == s9);

    }
}