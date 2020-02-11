/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadExecutorsRunnables;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

/**
 *
 * @author apere
 */
public class ThreadsExecutorsRunnables {
    
public static void main(String[] args) {
		
		 Stream<String> flow = Stream.of("BMW", "Mercedes", "Porsche");
		 
        ExecutorService service = Executors.newCachedThreadPool();
     
        flow.map(t->new Task(t)).forEach(service::execute);

	}

}

class Task implements Runnable {
	 
    public Task(String make) {
       this.make = make;
    }
 
    private String make;
    
    
    public void run() {
 
        for (int i = 0; i < 5; i++) {
            System.out.println(make + " - Thread combination: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }
        }
 
    }
}
