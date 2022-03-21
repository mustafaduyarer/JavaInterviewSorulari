package javaInterviewSorulari;

import java.util.*;

public class yuzdenBuyukleriSil {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,100,101, 200, 300));

        for (ListIterator<Integer> num = list.listIterator(); num.hasNext(); )

            if (num.next() > 100)

                num.remove();


        System.out.println(list);
    }
}