import java.util.*;

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int g = 1;

        for (int i = 1; i <= N && i <= M; ++i) {

            if (N % i == 0 && M % i == 0){
                g = i;
            }
        }

        System.out.println(g);
    }
}
