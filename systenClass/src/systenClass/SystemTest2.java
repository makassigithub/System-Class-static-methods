package systenClass;

public class SystemTest2 {

	public static void main(String[] args) {
		// Let's try another static method arraycopy();
		 
		byte[] a = new byte[]{65,66,67,68,69,70};// decimal value of bytes

		//create a string using an array of bytes
		String string_a = new String(a);
		System.out.println("string_a: "+string_a);

		//initialize a array of b with the same size like a
		byte[] b = new byte[a.length];
		
		// copy array elements from a to b
		System.arraycopy(a,0,b,0,a.length);
		
		String string_b = new String(b);
		System.out.println("string_b: "+string_b);

		// print each byte element and their string equivalent
		for (byte bt: b){
			System.out.println(" byte with decimal value of "+bt +" represents character: "+ new String(new byte[]{bt}));
		}

	}

}
