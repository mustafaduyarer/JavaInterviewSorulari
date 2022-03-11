package javaInterviewSorulari;

public class reverseStringWithMethod {
    public static void main(String[] args) {

        reverseMethod("Mustafa") ;
        reverseMethod("java dersleri");
    }
    public static void reverseMethod(String str)
    {
        String rvsMethod="";
        for (int i= str.length()-1; i>=0; i--){
            rvsMethod+= str.charAt(i);
        }
        System.out.println(rvsMethod);


    }
}
