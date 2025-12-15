import java.util.*;
public class Main
{
public static Queue <Integer> copyQ(Queue <Integer> q){
    Queue <Integer> h= new Queue<Integer>();
    Queue <Integer> p= new Queue<Integer>();
        while(!q.isEmpty()){
            p.insert(q.head());
            h.insert(q.remove());}
            
            while(!q.isEmpty()){
                q.insert(p.remove());}
                
         return h; } 
        
    
 public static boolean isIn(Queue <Integer> q,int x){
     while(!q.isEmpty()){
         int a=q.remove();
           if(a==x) 
               return true;
     }
     return false;
}
public static double avg(Queue <Integer> q){
    double count=0;
    double sum=0;
    while(!q.isEmpty()){
         int a=q.remove();
         sum+=a;
         count++;
    }
return sum/count;}

public static int div(Queue <Integer> q, int num){ 
    int count=0;
     while(!q.isEmpty()){
          int a=q.remove();
           if(num%a==0) 
               count++;
     }
return count;}


static Scanner reader = new Scanner(System.in);
public static void main(String []args){
    Queue <Integer> q= new Queue<Integer>();
    q.insert(3);
    q.insert(5);
    q.insert(6);
    q.insert(11);
    q.insert(2);
     Queue <Integer> q2=copyQ(q);
   System.out.println(isIn(q2,5));
   System.out.println(avg(q2));
   System.out.println(div(q2,3));
}
}