public class YasayQueue {
    private int maxSize;
    private double[] queArray;
    private int nItems;

    public YasayQueue(int size) {
        maxSize = size;
        queArray = new double[maxSize];
        nItems = 0;
    }

    public void insert(double item) {
        int i;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (i = nItems - 1; i >= 0; i--) {
                if (item > queArray[i]) {
                    queArray[i + 1] = queArray[i];
                } else {
                    break;
                }
            }
            queArray[i + 1] = item;
            nItems++;
        }
    }

    public void displayQueue() {
        if (nItems == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        YasayQueue q = new YasayQueue(10);

        q.insert(33.4);
        q.insert(52.5);
        q.insert(88.7);
        q.insert(44.3);
        q.insert(14.0);

        q.displayQueue();
    }
}