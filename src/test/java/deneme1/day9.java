package deneme1;

public class day9 {
    public static void main(String[] args) {

        int [] array = {2,3,5,7,9,77,66,55,44};

        int num1=0;
        int num2=0;

        for (int i:array) {
            if(i > num1)
            {
               num2=num1;
                num1=i;
            }else if (i>num2){
                num2=i;
            }

        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
