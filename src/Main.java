import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input =new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2=input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("seçiminiz: ");
        select=input.nextInt();

        switch (select){
            case(1):
                System.out.println("Toplam : "+(n1+n2));
                break;
            case(2):
                System.out.println("Çıkarma:"+(n1-n2));
                break;
            case(3):
                System.out.println("Çarpma"+(n1*n2));
                break;
            case(4):
                if (n2!=0) {
                    System.out.println("Bölme" + (n1 / n2));
                }
                else{
                    System.out.println("2.sayı 0 olamaz!");
                }
                break;
            default:
                System.out.println("hatalı seçim yaptınız! 1,2,3, veya 4 girilmeli");
        }
        }

    }
