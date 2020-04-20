package homework2;

public class Main {

    private static final int SIZE = 4;

    private static final String[][] DATA = new String[][]{
            {"0", "1", "2", "3"},
            {"4", "5", "6", "7"},
            {"8", "9", "10", "11"},
            {"12", "13", "14", "15"},
    };

    public static void main(String[] args) {
        try {
            int result = sumArray(DATA);
            System.out.println("Сумма чисел в массиве: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива");
             e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Некорректные данные в массиве");
            e.printStackTrace();
        }
    }

    private static int sumArray(String[][] data) {
        checkArraySize(data);

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            String[] array = data[i];
            for (int j = 0; j < array.length; j++) {
                String value = array[j];
                try {
                    sum += Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }

        return sum;
    }

    private static void checkArraySize(String[][] data) {
        if (data.length != SIZE) {
            throw new MyArraySizeException();
        }

        for (String[] array : data) {
            if (array.length != SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}
