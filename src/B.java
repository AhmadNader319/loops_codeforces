import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int n = 0 ;
        for (int i = 1 ;i<=N;i++)
        {
            if (N==1){
                System.out.println("-1");;
            }
            if (i % 2 == 0){
                System.out.println(i);
            }

        }

    }
}
