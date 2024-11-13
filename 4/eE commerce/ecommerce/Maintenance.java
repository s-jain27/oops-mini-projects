package ecommerce;

class Maintenance extends Thread {
    // Run method for background 
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100); // Run every 1 seconds
                System.out.println("Generating sales report...");
            } catch (Exception e) {
                System.out.println(e.getMessage()); }
        }
    }
}

