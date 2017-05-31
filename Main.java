import java.util.*;
public class Main 
{
  public static void main(String[] args) 
  {
  int i,j,max;
Scanner in=new Scanner(System.in);
System.out.print("Up to what number do you want to list prime numbers?:");

max=in.nextInt();
boolean sieve[]=new boolean[max];
for(i=0;i<max;i++)
    sieve[i]=true;
for(i=2;i<=max/2;i++)
   if(sieve[i])
        for(j=i;j<max;j+=i)
             if(sieve[j]&&j!=i)
                 sieve[j]=false;
   
System.out.println("The prime numbers between 2 and "+max+":");
  j=0;
  for(i=2;i<max;i++)
   {if(sieve[i])
       { System.out.print(i+" ");
         j++;
        if(j%15==0)
              System.out.println(" ");
       }
    }
  }
}
