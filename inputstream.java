import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class inputstream {

    public static void main(String[] args) {
        try {

            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis1 = new PipedInputStream(pos);
            PipedInputStream pis2 = new PipedInputStream();
            PipedOutputStream pos2 = new PipedOutputStream(pis2);

            PipedOutputWorker worker = new PipedOutputWorker(pos);
            Thread workerThread = new Thread(worker);
            workerThread.start();

            int data;
            while ((data = pis1.read()) != -1) {
                System.out.println("Read from pis1: " + data);
            }

            pis1.close();
            for (int i = 4; i <= 6; i++) {
                pos2.write(i);
            }
            pos2.close();
            int data2;
            while ((data2 = pis2.read()) != -1) {
                System.out.println("Read from pis2: " + data2);
            }

            pis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class PipedOutputWorker implements Runnable {
        private PipedOutputStream pos;

        public PipedOutputWorker(PipedOutputStream pos) {
            this.pos = pos;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 3; i++) {
                    pos.write(i);
                }
                pos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
