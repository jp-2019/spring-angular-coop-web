public class MultiThread {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < 8; i++)
        {
            MultiThreadDemo object = new MultiThreadDemo();
            object.start();
        }
    }
}
