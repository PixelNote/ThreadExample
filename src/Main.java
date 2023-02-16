public class Main {
    public static void main(String[] args) {

        System.out.println("Buenos días, me regala un cafe por favor");
        Cafe cafe = new Cafe(10);
        Thread th = new Thread(cafe);
        th.start();

        Chisme chisme = new Chisme();
        chisme.run();

    }
}