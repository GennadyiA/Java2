package homework5;

import java.util.Arrays;

public class task1 {
    public static final int SIZE = 10_000_000;
    public static final int HALF_SIZE = SIZE/2;

    public static void main(String[] args) {
        float[] data1 = createArray();
        float[] data2 = createArray();

        System.out.println("Время выполнения первого метода: " + singleThread(data1) + "мс");
        System.out.println("Время выполнения второго метода: " + doubleThread(data1) + "мс");

    }
    private static float[] createArray(){
        float[] array = new float[SIZE];
        Arrays.fill(array,1f);
        return array;
    }

    private static long singleThread(float[] data){
        long start = System.currentTimeMillis();
        calculation(data);
        long finish = System.currentTimeMillis();
        return finish-start;
    }

    public static long doubleThread (float[] data){
        long start = System.currentTimeMillis();
        float[] part1 = new float[HALF_SIZE];
        System.arraycopy(data, 0, part1, 0, HALF_SIZE);
        float[] part2 = new float[HALF_SIZE];
        System.arraycopy(data, HALF_SIZE, part2, 0, HALF_SIZE);
        Thread thread1 = new Thread(() -> calculation(part1));
        Thread thread2 = new Thread(() -> calculation(part2));
            thread1.start();
            thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
              }

        System.arraycopy(part1, 0, data, 0, HALF_SIZE);
        System.arraycopy(part2, 0, data, 0, HALF_SIZE);
        long finish = System.currentTimeMillis();
        return finish-start;
    }

    public static void calculation (float[] data){
        for ( float i : data) {
            data[(int) i] = (float) (data[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
