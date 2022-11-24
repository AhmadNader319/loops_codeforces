import java.util.*;

public class N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        int N = input.nextInt();
        int []arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = input.nextInt();
        }
        for (int i=0;i<N;i++){
            for (int j=1;j<=arr[i];j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
