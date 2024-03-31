package Ex4;

public class ExecutionThread extends Thread{

    final Integer monitor;
    int[] times;

    public ExecutionThread(Integer monitor, int[] times){
        this.monitor = monitor;
        this.times = times;
    }

    public void run(){

        while(true){
            synchronized (monitor){
                System.out.println(this.getName() + " - STATE 1");
                try {
                    Thread.sleep(Math.round(Math.random() * (times[1] - times[0]) + times[0]) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " - STATE 2");
            try {
                Thread.sleep((long)times[2] * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " - STATE 3");
        }

    }
}
