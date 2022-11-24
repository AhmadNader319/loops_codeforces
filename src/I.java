import java.util.*;

public class I {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String No = String.valueOf(N);
        StringBuilder reverse = new StringBuilder();
        int l = No.length();
        boolean flag =true;
        int d = 0;
        for ( int i = l-1 ; i >= 0; i-- ){
            reverse.append(No.charAt(i));
        }
        for ( int i = 0 ; i < l; i++ ){
            if (reverse.charAt(i)>'0'){
                flag = false ;
                d = i ;
                break;
            }
        }
        if (!flag){
            for ( int i = d ; i < l; i++ ){
                System.out.print(reverse.charAt(i));
            }
        }

        if (No.equals(reverse.toString())){
            System.out.println("\nYES");
        }
        else{
            System.out.println("\nNO");
        }



    }
}