public class ThreadOperation {
    public static void main(String[] args) {

        // // Single threading
        // Play p1 = new Play();
        // p1.run();
        
        // Play p2 = new Play();
        // p2.run();

        // Play p3 = new Play();
        // p3.run();

        // Play p4 = new Play();
        // p4.run();


        // multi threading
        Play p1 = new Play();
        p1.start();
        
        Play p2 = new Play();
        p2.start();

        Play p3 = new Play();
        p3.start();

        Play p4 = new Play();
        p4.start();
    }    
}

class Play extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

