class TimerUsingThread extends Thread{
	public static void main(String[] args){
		TimerUsingThread t1= new TimerUsingThread();

		t1.start();
	}
	@Override
	public void run(){
		int i=1;
		
		while(i!=0){
			System.out.print(i +"\r");
			try{
				i++;
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){

			}		
		}
	}
}

	

