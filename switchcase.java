import java.util.*;
public class switchcase{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int day=s.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
             case 3:
                System.out.println("wednesday");
                break;
             case 4:
                System.out.println("Thursday");
                break;
             case 5:
                System.out.println("Friay");
                break;
             case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("MSunday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
