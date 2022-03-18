package javaInterviewSorulari;

public class reverseInteger {


            public static void main(String[] args) {
                int num = 2345;
                System.out.println(method1(num));
                System.out.println(method2(num));
            }

            // 1. solution
            public static int method1(int number) {

                int reverse = 0;
                while (number != 0) { //(number>0||number<0)
                    int reminder = number % 10;
                    reverse = reverse * 10 + reminder;
                    number = number / 10;
                }
                return reverse;
            }
            // 2. solution

            public static int method2(int data) {
                String str = Integer.toString(data);

                StringBuffer sbf=new StringBuffer(str);
                sbf.reverse();

                int result=Integer.parseInt(sbf.toString());
                return result;
            }

    }

