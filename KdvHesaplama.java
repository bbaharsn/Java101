import java.util.Scanner;

class KdvHesaplama{
    public static void main(String[] args) {
      double fiyat , kdvOran=0.18;

      Scanner scan=new Scanner(System.in);
      System.out.print("Lütfen ürünün fiyatını giriniz:");
      fiyat=scan.nextDouble();

      double kdvTutar=fiyat*kdvOran;
      double kdvliFiyat=fiyat+kdvTutar;

      System.out.println("Kdv eklenmiş fiyat="+kdvliFiyat);



    }
}
