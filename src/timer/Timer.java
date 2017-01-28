package timer;

/**
 * Provides a facility of timing execution of methods,
 * and for slowing the execution of those methods.
 * 
 * @author Hugh Osborne
 * @version October 2012
 */
public class Timer extends Thread
{
    static int delay;
    
    /**
     * Set the delay for slowing down processes
     * The same delay factor should be used for all processes, so this
     * method is static
     * @param delay the duration, in seconds, of a delay action
     */
    public static void setDelay(double d) {
        delay = (int) (d*1000);
    }
    
    
    /**
     * Report the current delay
     * @return the current delay
     */
    public static double getDelay() {
        return delay;
    }
    
    /**
     * The delay method should be called in methods that are to be timed
     * to make their execution speed flexible
     */
    public void instruction() {
        try {
            sleep(delay);
        } catch (InterruptedException e) {}
    }    // instance variables - replace the example below with your own
}