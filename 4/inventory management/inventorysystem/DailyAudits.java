package inventorysystem;

public class DailyAudits extends Thread {
    @Override
    public void run(){ {
        while(true)
        try {
            Thread.sleep(100);
            System.out.println("doing daily audits");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}  
}
