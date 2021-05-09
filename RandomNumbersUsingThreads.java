import java.util.Random;
class RandomNumbersUsingThreads {
	public static void main(String args[]){

		Number n = new Number();
	    n.start();
	}
}
class Number extends Thread{
	
	public void run(){
		Random random = new Random();
		
		int randomInteger = random.nextInt(1000);
		System.out.println("Random Number generated : " + randomInteger);	

	}
}
