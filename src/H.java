import java.util.*;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int c = 0 ;
        if (N==1){
            System.out.println("NO");
            return;
        }
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                c++;
            }
        }
        if (c > 1)
            System.out.println("NO");

        else System.out.println("YES");
    }
}