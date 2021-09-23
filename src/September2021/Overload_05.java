package September2021;

public class Overload_05 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, int n, String value) {
        System.out.println("Третий метод");

    }

    public static void printMatrix(float m, int n, String value) {
        System.out.println("Четвертый метод");

    }
    public static void printMatrix(long m, int n, String value) {
        System.out.println("Пятый метод");

    }
    public static void printMatrix(long m, int n, Object value) {
        System.out.println("Шестой метод");

    }
    public static void printMatrix(int m, float n, String value) {
        System.out.println("Седьмой метод");

    }
    public static void printMatrix(int m, double n, String value) {
        System.out.println("Восьмой метод");

    }
    public static void printMatrix(int m, long n, String value) {
        System.out.println("Девятый метод");

    }
    public static void printMatrix(double m, double n, String value) {
        System.out.println("Десятый метод");

    }

}
