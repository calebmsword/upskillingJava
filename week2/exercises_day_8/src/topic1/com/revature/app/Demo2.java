package topic1.com.revature.app;

public class Demo2 {
    public static void main(String[] args) {

    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("Inside of child");
        }
    }
}
