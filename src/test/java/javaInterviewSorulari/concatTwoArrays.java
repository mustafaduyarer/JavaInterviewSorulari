package javaInterviewSorulari;


//Write a return method that can concate two arrays

import java.util.Arrays;

public class concatTwoArrays {
    public static void main(String[] args) {

        int[] firstArray = {23,45,12,78,4,90,1};        //source array
        int[] secondArray = {77,11,45,88,32,56,3};  //destination array

        int fal = firstArray.length;        //determines length of firstArray
        System.out.println(fal);
        int sal = secondArray.length;   //determines length of secondArray
        System.out.println(sal);

        int[] result = new int[fal + sal];//resultant array of size first array and second array
        System.out.println(result.length);

        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));    //prints the resultant array
    }

}
