import java.util.*;
public class eligibleforvote{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        int n=0;
        if(age>18){
            n=+1;
        }
        switch(n){
            case 0:
                System.out.println("not eligible to vote");
                break;
            case 1:
                System.out.println("eligible to vote");
                break;
        }
    }
}