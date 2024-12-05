import java.util.*;
public class primenum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int count=0;
            for(int j=1;j*j<=n;j++)
            {
                if(n%j==0)
                {
                    count+=1;
                    if(i*i!=n){
                        count+=1;
                    }
                }
           }
           if(count==2){
            System.out.println("prime number");
           }
           else{
            System.out.println("not prime number");
           }
        }
    }
}