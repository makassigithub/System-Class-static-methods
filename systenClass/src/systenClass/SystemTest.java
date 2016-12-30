package systenClass;


// the System class defines several methods and we will use a few
public class SystemTest {

 public static void main(String...args){
	 
// Will use the static method currentTimeMillis() to compare a for and a while loop
	 
 long start_For ;
 long end_For ;
 
 System.out.println("Timing for a for loop between 0 and 100,000,000");
 
 // Program starting time with the for loop
 start_For = System.currentTimeMillis();
 for(long i = 0; i< 100000000L;i++);
 
 //Program ending time with the For loop
 end_For = System.currentTimeMillis();
 System.out.println("Time Elapsed with the For Loop: " + (end_For-start_For));
 
 
 //Let's try this with the While loop
 
 long start_While;
 long end_While;
 
 // Let's get the entrance time;
 System.out.println("Timing for a while loop between 0 and 100,000,000");
 start_While = System.currentTimeMillis();
 long j = 0;
 while( j<100000000) j++;
 
 end_While = System.currentTimeMillis();
 
 System.out.println("Time Elapsed with the For Loop: "+ (end_While-start_While));
 	 
		 
 }
	
}
