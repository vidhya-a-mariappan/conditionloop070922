import java.util.*;
public class series {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number of series say n,2n,4n,8n,....");
        int num=s.nextInt();
        System.out.println("Enter the number n to print nth term");
        int n=s.nextInt();
        for(int i=1;i<n;i++)
            num*=2;
        System.out.println(n+ "th term of a series is "+ num);
    }
}
