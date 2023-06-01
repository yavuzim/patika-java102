package FootballTournament;

public class Main {
    public static void main(String[] args) {
            System.out.print("Takım Sayısı : ");
             int teamCount = Input.in.nextInt();
             Input.in.nextLine();
            Game game = new Game(teamCount);
            game.start();
    }
}
