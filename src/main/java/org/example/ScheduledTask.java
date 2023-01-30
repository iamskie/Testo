package org.example;
import org.bouncycastle.crypto.tls.CertificateURL;

import java.util.TimerTask;
import java.util.Date;
/**
 *
 * @author Dhinakaran P.
 */
// Create a class extends with TimerTask
public class ScheduledTask extends TimerTask {

    Date now; // to display current time

    // Add your task here
    public void run() {
        now = new Date(); // initialize date
        System.out.println("Time is :" + now); // Display current time
        Cutebaby cb = new Cutebaby();
        cb.cuteBabyTask();
    }
}