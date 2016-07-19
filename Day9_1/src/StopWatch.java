/**
 * Created by Hieu It on 7/18/2016.
 */
public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean ckech = false;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = startTime;
    }

    public void start(){
        ckech = true;
        this.startTime =  System.currentTimeMillis() ;
    }

    public long stop(){
        this.endTime=  System.currentTimeMillis();
        endTime = endTime-startTime;
        if (!ckech){
            endTime = 0;
        }
        return endTime;
    }
}
