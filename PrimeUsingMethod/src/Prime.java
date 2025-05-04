import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a number :");
		 
        long num = 99999L;		
		
		Prime obj = new Prime();
		
		
		obj.prime1(num);
		obj.prime2(num);
		obj.prime3(num);
		obj.prime4(num);
		obj.prime5(num);
	}
	
	
    void prime1(long num) {
    	long startTime = System.currentTimeMillis();

    	int count = 0;
    	for(int i=1; i<=num; i++) {
    		if(num % i == 0) {
    			count++;
    		}
    	}
		long endTime = System.currentTimeMillis();
  
    	if(count == 2) {
    		System.out.println("prime");
    	}else {
    		System.out.println("not prime");
    	}
        System.out.println("Time taken :"+(endTime - startTime));       
        } 

       
    
    	void prime2(long num) {
        	long startTime = System.currentTimeMillis();

    		int count= 0;
    		for(int i=2 ; i<=num; i++) {
    			if(num % i == 0) {
    				count++;
    			}
    		}
    		long endTime = System.currentTimeMillis();

    		if(count == 1) {
    			System.out.println("prime ");
    		}
    		else {
    			System.out.println("not prime");
    		}
            System.out.println("Time taken :"+(endTime - startTime));       
            } 

 
       void prime3(long num) {
        	long startTime = System.currentTimeMillis();
        	int count = 0 ;
        	for(int i=2 ; i<=num-1; i++) {
        		if(num % i == 0) {
        			count++;
        		}

        	}
    		long endTime = System.currentTimeMillis();

        	if(count == 0) {
        		System.out.println("prime");
        	}
        	else {
        		System.out.println("not prime");
        	}
            System.out.println("Time taken :"+(endTime - startTime));       
            } 

         
        
            void prime4(long num) {
        	long startTime = System.currentTimeMillis();

        	int count = 0;
        	for(int i=2 ; i<=num/2; i++) {
        		if(num % i == 0) {
        			count++;
        		}
        	}
    		long endTime = System.currentTimeMillis();

        	if(count == 0) {
        		System.out.println("prime");
        	}
        	else {
        		System.out.println("not prime");
        	}
            System.out.println("Time taken :"+(endTime - startTime));       
            } 

        
            void prime5(long num) {
        	long startTime = System.currentTimeMillis();

        	int count = 0;
        	for(int i=2 ; i<=Math.sqrt(num); i++) {
        		if(num % i == 0) {
        			count++;
        			
        		}
        	}
    		long endTime = System.currentTimeMillis();

        	if(count == 0) {
        		System.out.println("prime");
        	
        	}else {
        		System.out.println("not prime");
        	}
            System.out.println("Time taken :"+(endTime - startTime));        } 
    }
       
