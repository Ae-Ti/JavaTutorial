public class Main {
    public static void main(String[] args) {

        String name;
        name = "taeil";
        System.out.println("Hello world!");
        System.out.println("I like Java;");

        double sleptHour = 6.5;
        char endOfSyntax = '!';
        System.out.println("My name is "+name+", and I slept "+sleptHour+" hour"+endOfSyntax);

        final String MY_IDENTITY = "identity";

        System.out.println((float)1);
        System.out.println((int)1.1+1);

        String s1 = String.valueOf(1);
        s1 = Integer.toString(1);
        int i = Integer.parseInt("1");

        int[] aas = {1,2,30};
        for (int aa: aas){
            System.out.println(aa);
        }
    }
}
//주석1
/*
* 주석2
*/