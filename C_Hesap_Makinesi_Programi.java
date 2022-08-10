import java.util.Scanner;
public class C_Hesap_Makinesi_Programi {
    public static void main(String[] args) {

      /*  int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz :");
        n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Islem Sonucu: "+ (n1+n2));

        }else if(select == 2){
            System.out.println("Islem Sonucu: " + (n1-n2));

        }else if(select == 3){
            System.out.println("Islem Sonucu: " + (n1*n2));

        }else if(select == 4){

            if(n2 != 0){
                System.out.println("Islem Sonucu: " +(n1/n2));
            }else{
                System.out.println("Sifira Bolunemez");
            }

        }else{
            System.out.println("Hatali Kodlama");
        } */

        // Odev;


        int number1,number2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("Number1 Giriniz: ");
        number1 = input.nextInt();

        System.out.print("Number2 Giriniz: ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.print("Toplama Sonucu: " + (number1 + number2));
                break;

            case 2:
                System.out.print("Cikarma Sonucu: " + (number1 - number2));
                break;

            case 3:
                System.out.print("Carpma Sonucu: " + (number1 * number2));
                break;

            case 4:

                if(number2 != 0){
                    System.out.print("Bolme Sonucu: " + (number1 / number2));
                }else{
                    System.out.println("Sifira Bolunemez");
                }
                break;

            default:
                System.out.println("Hatali Kodlama");

        }
    }
}
