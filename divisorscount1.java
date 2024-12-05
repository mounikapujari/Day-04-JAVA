import java.util.*;
public class divisorscount1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int count=0;
            for(int j=1;j<=(n*n)*1/2;j++)
            {
                if(n%j==0)
                {
                    System.out.print(j+" ");
                    count+=1;
                }
            }
            System.out.println("count="+count);
            System.out.println();
        }
    }
}