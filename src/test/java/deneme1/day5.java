package deneme1;

public class day5 {
    public static void main(String[] args) {
        String reversed="";
        String str = "mustafa";

        for(int i=str.length()-1;i>=0;i--){

            reversed+=str.charAt(i);
        }

        System.out.println(reversed);

    }
}
