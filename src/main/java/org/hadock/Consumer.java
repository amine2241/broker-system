package org.hadock;

public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
       while(true) {
           try {
               Thread.sleep(5000);
           }catch (InterruptedException e){
               System.out.println(e.getMessage());
           }
           buffer.consume();
       }
    }

}
