//Question 2 : A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j > 1 and j = i + 1. 
//Write a function named isConsecutiveFactored that returns 1 if its argument is consecutive-factored, otherwise it returns 0. 
//No additional data structure including arrays allowed. 
//the function signature is
//int isConsectiveFactored(int n)


package mum.entrytest;

/**
 *
 * @author Tesfay
 */
public class ConsecutiveFactored {
    
    public int isConsectiveFactored(long n)
    {
        if(n < 2)
            return 0;
        
        long start = System.currentTimeMillis();
        for(long factor = 2; factor*factor <= n ; factor++)
        {
            while(n%factor==0)
            {
                if(n%(factor+1)==0)
                {
                    System.out.println("isConsectiveFactored time spent : " + (System.currentTimeMillis()-start));
                    return 1;       
                }
                n = n/factor;
            }
        }
        System.out.println("isConsectiveFactored time spent : " + (System.currentTimeMillis()-start));
        return 0;      
    }
    
    public long isConsectiveFactored2(long n)
    {
            long start = System.currentTimeMillis();
            for( long factor=2 ; factor <= n / 2 ; factor++ ){
	    	if( n % factor == 0 )
                {
                    if( factor+1 <= n && n%(factor+1)==0) 
                    { 
                         System.out.println("isConsectiveFactored2 time spent : " + (System.currentTimeMillis()-start));
                        return 1;
                    }
                }
	    }
            System.out.println("isConsectiveFactored2 time spent : " + (System.currentTimeMillis()-start));
	    return 0;
    }
}
