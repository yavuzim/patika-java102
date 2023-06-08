package PatikaStore;

public class Line {
    protected static void line(int n, String shape) {
        for (int i = 1; i <= n; i++) {
            System.out.print(shape);
        }
        System.out.println();
    }
}
