class SumOfNumbers{
	public static void main(String[] args) {
		int num=100;
		int i;
		int sum = 0;
		for(i=1; i<=num; i++)
		{
			sum= sum+i;
		}
		System.out.println("Sum of first " +num+ " numbers are " +sum);
	}
}