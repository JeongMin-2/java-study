import java.util.Scanner;
public class Week02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if(year % 4 == 0)
        {
            if(year % 100 != 0 || year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        else System.out.println("0");

    }

}