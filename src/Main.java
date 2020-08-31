import behave.Randoms;

public class Main {
    public static void main(String[] args) {
        final int min = 90; // Минимальное число для диапазона
        final int max = 100; // Максимальное число для диапазона

        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            if (r == max) {
                System.out.printf("Выпало число %d, давайте на этом закончим\n", max);
                break;
            }
        }
    }}
