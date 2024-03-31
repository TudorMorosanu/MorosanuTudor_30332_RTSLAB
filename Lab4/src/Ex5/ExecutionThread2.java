package Ex5;

public class ExecutionThread2 extends Thread {
    int[] times;
    final Integer lock;
    public ExecutionThread2(Integer lock, int[] times){
        this.times = times;
        this.lock = lock;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        try {
            synchronized (lock) {
                lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName() + " - STATE 2");
        try {
            Thread.sleep(Math.round(Math.random() * (times[1] - times[0]) + times[0]) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName() + " - STATE 3");
    }
}
