import java.util.*;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int x=2;
        for(int i=x;i<=N;i++) {
            boolean flag = true;

            for(int j=2;j<i;j++) {

                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i+" ");
            }
        }
    }
}
