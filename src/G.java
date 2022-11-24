import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        long []arr = new long[N];

        for (int i = 0;i<N;i++) {
            arr[i] =input.nextLong();

        }
        long factorial = 1;

        for (int i = 0;i<N;i++){
            for (int  j = 2; j <= arr[i]; j++) {
            factorial = factorial * j;
            }
            arr[i]=factorial;
            factorial=1;
        }
        for (int i = 0;i<N;i++) {
            System.out.println(arr[i]);
        }

    }
}
