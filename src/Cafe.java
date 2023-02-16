public class Cafe implements Runnable{
    private int timeDone;

    public Cafe(int timeDone) {
        this.timeDone = timeDone;
    }

    public void run(){
        System.out.println("Vale, su cafe va a estar listo en un momento.");

        try {
            Thread.sleep(timeDone*1000);
            System.out.println("Su cafe esta listo.");

        }
        catch(InterruptedException ex){
            System.out.println("No se puedo hacer el cafe.");
        }



}
}
