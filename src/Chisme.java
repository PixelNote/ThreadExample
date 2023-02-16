public class Chisme implements Runnable{

    @Override
    public void run() {

        try {
            System.out.println("Maria: Imaginate que me encontre con Yeyson y no sabes lo que me dijo.");
            Thread.sleep(1000);
            System.out.println("Josefina: No se cuentame.");
            Thread.sleep(1000);
            System.out.println("Maria: El se esta comiendo con el profesor de Contabilidad.");
            Thread.sleep(1000);
            System.out.println("Josefina: El de Contabilidad?!?!?!?");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
