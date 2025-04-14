/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan7;

/**
 *
 * @author HP
 */
public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean run;

    StopWatch() {
        startTime = System.nanoTime();
        run = false;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    
    public void start() {
        this.startTime = System.nanoTime();
        this.run = true;
    }
    
    public void stop() {
        this.endTime = System.nanoTime();
        this.run = false;
    }
    
    public long getElapsedTime() {
        if (run) {
            return (System.nanoTime() - startTime);
        } else {
            return endTime - startTime;
        }
    }
}
