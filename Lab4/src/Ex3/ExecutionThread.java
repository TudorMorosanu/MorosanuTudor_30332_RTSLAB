package Ex3;

import Ex2.ExecutionThread2;

public class ExecutionThread extends Thread{

    final Integer monitor, monitorSh;
    int[] times;

    public ExecutionThread(Integer monitor, Integer monitorSh, int[] times){
        this.monitor = monitor;
        this.monitorSh = monitorSh;
        this.times = times;
    }

    public void run(){
        System.out.println(this.getName() + " - STATE 1");
        try {
            Thread.sleep(Math.round(Math.random() * (times[1] - times[0]) + times[0]) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " - STATE 2");
        synchronized (monitor) {
            synchronized (monitorSh){
                try {
                    Thread.sleep(Math.round(Math.random() * (times[3] - times[2]) + times[2]) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " - STATE 3");
            try {
                Thread.sleep((long)times[4]*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + " - STATE 4");
    }

}
