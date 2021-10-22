import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}
    class Worker {
        Random random = new Random();

        private List<Integer> list1 = new ArrayList<>();
        private List<Integer> list2 = new ArrayList<>();

        public void addToList1() throws InterruptedException {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
        public void addToList2() throws InterruptedException {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
        public void work() throws InterruptedException {
            for (int i = 0; i < 1000; i++) {
                addToList1();
                addToList2();
            }
        }
        public void main() throws InterruptedException {
            long before = System.currentTimeMillis();
            work();
            long after = System.currentTimeMillis();
            System.out.println("Program worked " + (after - before) + " ms");
            System.out.println("List1 " + list1.size());
            System.out.println("List2 " + list2.size());
        }
    }

