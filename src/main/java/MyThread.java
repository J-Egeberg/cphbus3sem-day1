/**
 * Created by jensegebergrasmussen on 31/01/17.
 */
public class MyThread {

    public static void main(String[] args) {

        int[] count = new int[]{0};

        Runnable r = () -> count[0]++;

        new Thread(() -> count[0]++);

    for (int i = 0; i < 1000; i++){
        new Thread(r).start();
    }
        System.out.println(count[0]);

    }

}
