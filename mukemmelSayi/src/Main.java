public class Main {
    public static void main(String[] args) {
        // 28'in bölenleri = 1,2,4,7,14 sum => 28 => Mükemmel Sayı

        int number = 30;
        int sum = 0;

        for (int i=1; i<number; i++){
            if (number % i == 0){
                sum+=i;
            }
        }

        if (sum == number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }





    }
}