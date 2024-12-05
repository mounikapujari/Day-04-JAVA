import java.util.*;
public class middlenum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a<b){
            if(b<c){
                System.out.println("middle num b="+b);
            }
            else{
                if(a<c){
                  System.out.println("middle num a="+a);  
                }else{
                 System.out.println("middle num c="+c);
                }
            }
        }else{
            if(a<c){
                System.out.println("middle num a="+a);
            }else{
                if(b<c){
                   System.out.println("middle num c="+c); 
                }
                else{
                   System.out.println("middle num b="+b); 
                }

            }
        }


    }
}