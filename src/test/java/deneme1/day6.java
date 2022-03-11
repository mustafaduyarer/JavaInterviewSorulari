package deneme1;

import java.util.HashMap;

public class day6 {


    public static void main(String[] args) {
       String metin= "Bugun mustafa ve mustafa mustafa ile beraber gittiler";
       String [] parcala = metin.split(" ");

        HashMap<String, Integer> kelimeler = new HashMap<>();

        for (int i =0 ; i< parcala.length; i++){
            String kel=parcala[i];

            if(kelimeler.containsKey(kel)){
                int sayi= kelimeler.get(kel);
                kelimeler.put(kel,sayi+1);
            }else {
                kelimeler.put(kel,1);
            }
        }
        System.out.println(kelimeler);
    }
}
