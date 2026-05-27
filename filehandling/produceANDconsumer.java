package Filehandling;
class SharedData {

    private int data;
    private boolean available = false;

    synchronized void produce(int value) {

        while(available) {
            try {
                wait();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);

        notify();
    }

    synchronized void consume() {

        while(!available) {
            try {
                wait();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);

        available = false;

        notify();
    }
}

class Producer extends Thread {

    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for(int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {

    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for(int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}
public class produceANDconsumer {
	 public static void main(String[] args) {

	        SharedData data = new SharedData();

	        Producer p = new Producer(data);
	        Consumer c = new Consumer(data);

	        p.start();
	        c.start();
	    }
}
