// class Fourvehiler extends Thread {
//     @Override
//     public void run() {
//         System.out.println("car is four vehiler ");
//     }
// }

// class Twovehiler implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("bike is two vehiler");
//     }

//     public static void main(String[] args) {
//         Fourvehiler fourvehiler = new Fourvehiler();
//         fourvehiler.start();

//         Thread twovehilertThread = new Thread(new Twovehiler());
//         twovehilertThread.start();
//     }

// }

public class ThreadExample {

    // Define a custom thread class that extends Thread
    static class MyThread extends Thread {
        private String threadName;

        public MyThread(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            // Print the name of the thread when it starts
            System.out.println("New thread: " + this);

            for (int i = 0; i < 6; i++) {
                // Print the progress of the thread
                System.out.println(threadName + ": " + i);
                try {
                    // Sleep for a short time to simulate work and allow interleaving
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Print when the thread stops
            System.out.println(threadName + " Stopped.");
        }

        @Override
        public String toString() {
            return "Thread[" + threadName + ", " + getPriority() + ", " +
                    getThreadGroup().getName() + "]";
        }
    }

    public static void main(String[] args) {
        // Create and start two threads
        MyThread firstThread = new MyThread("First thread");
        MyThread secondThread = new MyThread("Second thread");

        firstThread.start();
        secondThread.start();

        try {
            // Wait for both threads to complete before exiting main
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print when all threads have finished
        System.out.println("Exiting the main Thread code of this program.");
    }
}
