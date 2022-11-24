import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int []arr = new int[N];
        int max = 0;
        for (int i = 0 ;i<N;i++)
        {
            arr[i] = input.nextInt();
            max = arr[0];
        }
        for (int i = 0 ;i<N;i++)
        {

            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
