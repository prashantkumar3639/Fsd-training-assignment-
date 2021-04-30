class FibonacciSeries{
	public static void main(String[] args) {
		 int num1 = 1, num2 = 2;
  		int N = 10;
        int i = 1;
  
        while (i <= N) {
  
             System.out.print(num1 + " ");
  
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i = i + 1;
        }
	}
}