package deneme1;

public class day7 {


    public static void main(String[] args) {
        System.out.println(6%1);
        System.out.println(6%2);
        System.out.println(6%3);
        System.out.println(6%4);
        System.out.println(6%5);



        int sayi = 6;
        boolean sonuc = mukemmelSayiKontrol(sayi);
        System.out.println(sonuc);
    }

    private static boolean mukemmelSayiKontrol(int sayi) {
        int toplam=0;

        for(int i =1; i<=sayi/2; i++){
            if(sayi % i==0){
                toplam+=i;
            }
        }
        boolean sonuc = toplam==sayi;
        return sonuc;
    }

}
