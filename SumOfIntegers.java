import java.util.Scanner;
class SumOfIntegers{
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the numbers");
	String IntegerList = sc.nextLine();
	// String IntegerList = "12 1 3 6 7";

	System.out.println(IntegerList);

	String []values = IntegerList.split(" ");

	int sum=0;

		for(String value : values){
			
			System.out.println(value);

			sum= sum+Integer.parseInt(value);
		}
		System.out.println("The sum of the given interger values are: " +sum);
	// int sum=0;	

	// 	for(int i=0; i<IntegerList.length(); i++){
 //         sum = sum + values[i];
 //      }

	}

}