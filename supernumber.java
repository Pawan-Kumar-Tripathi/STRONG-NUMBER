import java.io.*;
import java.util.*;
class supernumber
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i ,j, sum = 0, rem;
            for(;N!=0;)
            {
                int fact = 1;
                rem = N% 10;
                for( j =1 ; j<= rem ; j++)
                {
                     fact = fact * j ;
                     
                }
                sum = sum + fact;
                 N= N/10;
                 
                }
                System.out.println(sum);
            }
        }
                
                