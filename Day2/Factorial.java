import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact = fact * i;
            
        }
        System.out.println("Factorial of "+number+" is: "+fact);
	}
}