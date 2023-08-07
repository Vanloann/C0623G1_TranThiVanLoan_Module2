package ss04_class_and_object.baitap.StopWatch;

import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }

    public long getEndTime() {
        return endTime;
    }

//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
