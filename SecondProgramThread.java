class SecondProgramThread extends Thread{
	public void run(){
		int a=10;
		int b=15;
		System.out.print("Counter");
		for(int i=a;i<b;i++){
		System.out.print("  " +i+ "  ");
		try{
			Thread.sleep(5);}
		}
		catch (InterruptedException e) {
                System.out.println("Thread interrupted");
			}		
		System.out.println("Thread.currentThread().getState()");
		}
	public static void main(String[]args){
		SecondProgramThread obj = new SecondProgramThread();
		obj.start();
		}
}