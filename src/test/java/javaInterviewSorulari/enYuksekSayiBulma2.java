package javaInterviewSorulari;

import java.util.Arrays;

public class enYuksekSayiBulma2 {
    public static void main(String[] args) {

        int arr[]= {1,10,9,1,11,25,15,98,109};


        arrayiSirala(arr);
    }
    private static void arrayiSirala(int[] arr) {

        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));

        System.out.println("arrayin max elemani : "+arr[arr.length-1]);//en yuksek sayi bulma
        System.out.println(arr[arr.length-2]); //ikinci en buyuk sayi bulma
        System.out.println(arr[4]);

    }
}

