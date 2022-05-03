import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r;
        double Pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapınızı Giriniz :");
        r = input.nextDouble();

        double Alan = Pi*r*r;
        double Cevre = 2*Pi*r;
        System.out.println("Daire Alan :" + Alan);
        System.out.println("Çevre Alan :" + Cevre);



    }
}
