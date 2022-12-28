

public class Example extends Thread {
	
  @Override
	public void run() 
  {	
    for(int i=1; i<=10 ; i++)
		System.out.println("run() in ClassA!!" + i);
	}
	
  
	public static void main(String[] args) 
  {	
		Example obj = new Example();
		
		Thread t1 = new Thread();
		t1.start();// a new thread will be created which is responsible for running  the run() 
			   //present in Thread class.
		t1.run();// no new thread will be created we are directly calling Thread class Run()
		         //just like normal method call.		
		
		
		
		
		Thread t2 =new Thread (obj);
		t2.start();//a new thread will be created which is responsible for running the run()
			   //present in ClassA.
		t2.run();// no new thread  will be created but as we are overriding run() 
		         //present in Thread class, our ClassA run() will be executed.
		
	}
	

}


