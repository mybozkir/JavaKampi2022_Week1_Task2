
public class Main {
    public static void main(String[] args) {
        char harf = 'ü';
        char[] kalinSesli = {'A', 'I', 'O', 'U'};
        char[] inceSesli = {'E', 'İ', 'Ö', 'Ü'};
        char yeniHarf = Character.toUpperCase(harf);
        boolean kalinMi = false;
        boolean inceMi = false;
        //System.out.println(yeniHarf);


        for (char kalinKarakter : kalinSesli){
            if (kalinKarakter == yeniHarf){
                System.out.println(harf + " kalın sesli bir ünlüdür.");
                kalinMi = true;
                return;
            }
        }

        if(kalinMi == false){
            for (char inceKarakter : inceSesli){
                if (inceKarakter == yeniHarf){
                    System.out.println(harf + " ince sesli bir ünlüdür.");
                    inceMi = true;
                    return;
                }
            }
        }

        if (kalinMi == false && inceMi == false){
            System.out.println(harf + " Ünlü bir harf değildir.");
        }



    }
}