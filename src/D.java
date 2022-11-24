import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X =1999;
        while (true){
            int N = input.nextInt();
            if (N!=X){
                System.out.println("Wrong");
            }
            else {
                System.out.println("Correct");
                return;
            }
        }
    }
}
