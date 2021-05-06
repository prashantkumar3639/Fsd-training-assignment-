import java.util.Scanner;
class ReverseOfNumber{
	
		static int rev_num = 0;
    	static int base_pos = 1;
    	static int reverseDigits(int num)
    	{
        	if (num > 0) {
            
            	reverseDigits(num / 10);
            	rev_num = rev_num + ((num % 10) * base_pos);
            	base_pos = base_pos*10;
        	}
        	return rev_num;
    	}
    	
    	public static void main(String[] args) {

    		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter a Number");
        	int num = sc.nextInt();

			
        	System.out.println(reverseDigits(num));
		
	}
}

