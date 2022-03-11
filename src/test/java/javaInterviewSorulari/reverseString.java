package javaInterviewSorulari;

public class reverseString {
        public static void main(String[] args) {
            // metod for loop ile
            String s= "Selenium";

            int len = s.length();

            String rev = "";
            for (int i = len-1; i>=0; i--){
                rev = rev + s.charAt(i);
                //  System.out.println(rev);
            }
            System.out.println(rev);

            //2. metod StringBuffer :
            StringBuffer sf = new StringBuffer(s);
            System.out.println(sf.reverse());


            StringBuilder sd = new StringBuilder(s);
            System.out.println(sd.reverse());



        }
    }

