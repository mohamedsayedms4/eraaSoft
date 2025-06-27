public class Task extends Thread {

    private String name ;
    private int se ;

    public Task(String name, int se) {
        this.name = name;
        this.se = se;
    }

    @Override
    public void run() {
        System.out.println("Started "+name);
        try {
            Thread.sleep(se);
        }catch (Exception e){
            System.out.println("Error in "+name);
        }
        System.out.println("Finished "+name);
    }
}
