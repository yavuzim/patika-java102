package FootballTournament;

public class Line {
    public static void draw(int n, String item) {
        for (int i = 1; i <= n; i++) {
            System.out.print(item);
        }
        System.out.println();
    }
}
