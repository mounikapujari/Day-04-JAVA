import java.util.*;
public class divisorsofnum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            for(int j=1;j<=n;j++)
            {
                if(n%j==0)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}