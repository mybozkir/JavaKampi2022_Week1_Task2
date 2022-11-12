public class Main {
    public static void main(String[] args) {
        int number = 13;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number==1){
            System.out.println(number + " asal bir sayı değildir.");
            return;
        }else if (number < 1 ){
            System.out.println("Geçersiz sayı.");
            return;
        }else {
            for (int i=2; i<number; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            }

            if (isPrime){
                System.out.println(number + " asal bir sayıdır.");
            }else {
                System.out.println(number + " asal bir sayı değildir.");
            }

        }





    }
}