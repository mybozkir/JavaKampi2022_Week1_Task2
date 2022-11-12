public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double num : myList){
            if(max<num){
                max = num;
            }
            total += num;
        }
        System.out.println("Sayıların toplamı : " + total);
        System.out.println("En büyük sayı: " + max);
    }
}