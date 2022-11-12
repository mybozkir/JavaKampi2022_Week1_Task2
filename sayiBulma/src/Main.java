public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1,2,5,7,9,0};
        int aranacak = 3;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                System.out.println(aranacak + " sayısı dizi içinde bulunmaktadır.");
                break;
            }else {
                System.out.println(aranacak + " sayısı dizi içinde bulunmamaktadır.");
                break;
            }
        }
    }
}