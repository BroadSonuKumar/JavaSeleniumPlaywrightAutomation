package testcases;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduler {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Running test at : " + java.time.LocalDateTime.now());
                LinkedinRequestWithdraw.main();
            }catch (Exception e){
                System.err.println("Test Failed with the excepetion: "+ e.getMessage());
            }
            try{
                Thread.sleep(60* 1000);
            } catch (InterruptedException e) {
                System.err.println("Sleep interrupted Existing....");
                break;
            }
        }

    }
//
//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        Runnable task = () ->{
//            try{
//                LinkedinRequestWithdraw.main();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        };
//        scheduler.scheduleAtFixedRate(task,0,100, TimeUnit.MINUTES);
//    }
}
