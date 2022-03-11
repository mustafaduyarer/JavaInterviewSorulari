package deneme1;

public class day1 {

    public static void main(String[] args) {


        String str1 = "Hello World";
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());

        String name = "Alper Aslan";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);

    }


}