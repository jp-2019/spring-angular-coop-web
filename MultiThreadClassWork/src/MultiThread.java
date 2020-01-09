public class MultiThread extends Thread{


    public void run(){

        for (int i = 1; i < 1000; i++){
            System.out.println(i);
        }


    }

        public static void main(String[] args) {

        MultiThread thread1 = new MultiThread();
        Thread2 thread2 = new Thread2();

            System.out.println("Name of Tread1 " + thread1.getName());
            System.out.println("Name of thread2 " +thread2.getClass() );


        thread1.start();
        thread2.start();;

        thread1.setName("Kenny1");
            System.out.println("After changing thread1 name: " + thread1.getName());

        }
}
