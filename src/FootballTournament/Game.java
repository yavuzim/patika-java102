package FootballTournament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    private int teamsCount;
    private List<String> teams;
    private Random random;
    private List<String> firsRound;
    private List<String> secondRound;
    private int rnd;

    private int home = -1;
    private int away = -1;


    public Game(int teamsCount) {
        this.teamsCount = teamsCount;
        random = new Random();
        teams = new ArrayList<>();
        System.out.println("---TAKIMLARI GİRİNİZ---");
        Line.draw(2, "*");
        createTeams();
        Line.draw(2, "*");
        System.out.println("Takımlar : ");
        this.draw();
    }

    public void start() {
        System.out.println("***** TURNUVA MAÇLARI *****");
        System.out.println("Takım Sayısı : " + teams.size());
        Line.draw(2, "*");
        firsRound = new ArrayList<>();
        secondRound = new ArrayList<>();
        this.home = -1;
        this.away = -1;
        System.out.println(firsRound);
        System.out.println(secondRound);
        Line.draw(8, "-");
        this.print(this.firsRound, this.secondRound);
    }



    private void competitionCreate(int a, int b, String team1, String team2) {
        this.firsRound.add(a, team1);
        this.firsRound.add(b, team2);
        this.secondRound.add(a, team2);
        this.secondRound.add(b, team1);
    }

    private void generateIndex() {
        this.home = this.random.nextInt(0, this.teams.size());
        this.away = this.random.nextInt(0, this.teams.size());
    }

    

    private void createTeams() {
        for (int i = 0; i < this.getTeamsCount(); i++) {
            System.out.print("Takım Adı : ");
            String team = Input.in.nextLine();
            teams.add(team);
        }
    }

    private void print(List<String> firsRound, List<String> secondRound) {
        for (int i = 0; i < firsRound.size(); i += 2) {
            System.out.println(i + 1 + ". hafta");
            System.out.println(firsRound.get(i) + " vs " + firsRound.get(i + 1));
        }
        for (int i = 0; i < secondRound.size(); i += 2) {
            System.out.println(i + 1 + ". hafta");
            System.out.println(secondRound.get(i) + " vs " + secondRound.get(i + 1));
        }
    }

    private void teamsList() {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i));
        }
    }

    private void draw() {
        Object[] temp = teams.toArray();
        for (int i = 0; i < teams.size(); i++) {
            teams.set(i, null);
        }
        for (int i = 0; i < temp.length; i++) {
            this.rnd = random.nextInt(0, temp.length);
            if (teams.get(0) == null)
                teams.set(0, (String) temp[this.rnd]);
            else {
                int index = 0;
                while (index < teams.size()) {
                    if (teams.get(index) == temp[this.rnd] && teams.get(index) != null) {
                        this.rnd = random.nextInt(0, temp.length);
                        index = 0;
                        continue;
                    }
                    if (teams.get(index) == null) break;
                    index++;
                }
                teams.set(i, (String) temp[this.rnd]);
            }
        }
        System.out.println(this.teams);
    }

    public int getTeamsCount() {
        return teamsCount;
    }

    public void setTeamsCount(int teamsCount) {
        this.teamsCount = teamsCount;
    }
}
