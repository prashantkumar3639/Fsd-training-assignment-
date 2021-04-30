class VarArgDemo{
	public static void main(String[] args) {
		VarArgDemo ref= new VarArgDemo();

		System.out.println("Addition is:" + ref.add(12));
		System.out.println("Addition is:" + ref.add(12, 18));
		System.out.println("Addition is:" + ref.add(12,56,88));
		System.out.println("Addition is:" + ref.add(12,11,32,11));

	}
	int add(int... values){

		int sum=0;
		for(int i: values)
			sum = sum + i;

		return sum;
	}
}