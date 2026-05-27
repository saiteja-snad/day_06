package Filehandling;
class Counter{
	private int c=0;
	synchronized void increment() {
		c++;
	}
	void display() {
		System.out.println("final counter value: "+c);
	}
}

class mythread extends Thread{
	Counter counter;
	mythread(Counter counter){
		this.counter=counter;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			counter.increment();
			
		}
	}
}
public class shaaredsync {
	public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        mythread t1 = new mythread(counter);
        mythread t2 = new mythread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        counter.display();
	}
}
