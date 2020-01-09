import java.sql.SQLOutput;

public class Thread2 extends Thread{
    public void run() {

        for (int i = 1; i > 1000; i--){
            System.out.println(i);
        }
        System.out.println("Thread-2 made is through");

    }
}

