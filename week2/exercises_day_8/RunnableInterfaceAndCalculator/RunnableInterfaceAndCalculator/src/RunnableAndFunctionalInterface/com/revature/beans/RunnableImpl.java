package RunnableAndFunctionalInterface.com.revature.beans;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside of thread");
        for (int c=0; c < 10; c++) {
            try {
                Thread.sleep(500);
                System.out.println("in child: "+c);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child Thread execution has completed");
    }
}
