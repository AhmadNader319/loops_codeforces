import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int []arr = new int[N];
        int k=0,l=0,m=0,n=0 ;
        for (int i = 0 ;i<N;i++)
        {
            arr[i] = input.nextInt();
            if (arr[i] % 2 ==0){
            k++;
            }
            else {
            l++;
            }
            if (arr[i]<0){
            n++;
            }
            else if(arr[i]>0){
            m++;
            }

        }
        System.out.println("Even: "+k);
        System.out.println("Odd: "+l);
        System.out.println("Positive: "+m);
        System.out.println("Negative: "+n);
    }
}
