package deneme1;

public class Day2 {
    public static void main(String[] args) {

        int number = 1346;
        int sum = 0;
        while(number > 0) {
            sum += number%10; number = number/10;
        }
        System.out.println(sum);

    }






    }

