package deneme1;

public class day4 {


    public static class StringRev{
        // Function to reverse a string in Java using StringBuilder
        public static String rev(String s){
            return new StringBuilder(s).reverse().toString();
        }
        public static void main(String[] args){
            String s= "Welcome to Edureka"; // Note that string is immutable in Java
            s= rev(s);
            System.out.println("Result after reversing a string is : "+s);
        }
    }
}

