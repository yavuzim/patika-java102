package FootballTournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private int teamsCount;
    private List<String> teams;
    private Random random;
    private List<String> teamControlList;
    private List<String> firstMatch;
    private List<String> secondMatch;
    private int rnd;

    private int home;
    private int away;


    public Game(int teamsCount) {
        this.teamsCount = teamsCount;
        this.teams = new ArrayList<>();
        Line.draw(24, "*");
        System.out.println("*** TAKIMLARI GİRİNİZ ***");
        for (int i = 1; i <= this.teamsCount; i++) {
            System.out.print(i + ". Takım : ");
            String team = Input.in.nextLine();
            this.teams.add(team);
        }
        System.out.println(this.teams);
        Line.draw(24, "*");
        if (this.teamsCount % 2 != 0)
            this.teams.add("BAY");
    }

    public void start() {
        this.random = new Random();
        this.teamControlList = new ArrayList<>();
        this.firstMatch = new ArrayList<>();
        this.secondMatch = new ArrayList<>();
        String match1 = null, match2 = null, team1 = null, team2 = null;
        Line.draw(24, "-");
        int index = 0;
        for (int i = 1; i <= this.teamsCount - 1; i++) {
            for (int j = 0; j < this.teamsCount / 2; j++) {
                this.generateIndex();
                team1 = this.teams.get(this.home);
                team2 = this.teams.get(this.away);
                this.teamControl(team1, team2);
                match1 = this.teams.get(this.home) + " vs " + this.teams.get(this.away);
                match2 = this.teams.get(this.away) + " vs " + this.teams.get(this.home);
                this.matchControl(match1, match2);
                this.competitionCreate(index, index + 1, this.teams.get(this.home), this.teams.get(this.away));
                this.firstMatch.add(this.teams.get(this.home) + " vs " + this.teams.get(this.away));
                this.secondMatch.add(this.teams.get(this.away) + " vs " + this.teams.get(this.home));
            }
            System.out.println(this.teamControlList.size());
            for (int k = this.teamsCount - 1; k > -1; k--) {
                this.teamControlList.remove(0);
            }
        }
        this.log();
        Line.draw(24, "-");
    }

    private void teamControl(String team1, String team2) {
        while (this.teamControlList.contains(team1) || this.teamControlList.contains(team2)) {
            this.generateIndex();
            team1 = this.teams.get(this.home);
            team2 = this.teams.get(this.away);
        }
    }

    private void matchControl(String match1, String match2) {
        while (this.firstMatch.contains(match1) || this.firstMatch.contains(match2)) {
            this.generateIndex();
            teamControl(this.teams.get(this.home), this.teams.get(this.away));
            match1 = this.teams.get(this.home) + " vs " + this.teams.get(this.away);
            match2 = this.teams.get(this.away) + " vs " + this.teams.get(this.home);
        }
    }

    private void generateIndex() {
        this.home = -1;
        this.away = -1;
        while (this.home == this.away) {
            this.home = this.random.nextInt(0, this.teams.size());
            this.away = this.random.nextInt(0, this.teams.size());
        }
    }

    private void log() {
        System.out.println("1.DEVRE");
        for (int i = 1; i < this.teamsCount; i++) {
            System.out.println(i + ". Hafta");
            int start = (this.teamsCount * i - this.teamsCount) / 2;
            int finish = this.teamsCount * i / 2;
            for (int j = start; j < finish; j++) {
                System.out.println(this.firstMatch.get(j));
            }
        }
        Line.draw(24, " ");
        System.out.println("2.DEVRE");
        Line.draw(24, " ");
        for (int i = 1; i < this.teamsCount; i++) {
            System.out.println(i + ". Hafta");
            int start = (this.teamsCount * i - this.teamsCount) / 2;
            int finish = this.teamsCount * i / 2;
            for (int j = start; j < finish; j++) {
                System.out.println(this.secondMatch.get(j));
            }
        }
    }

    private void competitionCreate(int a, int b, String team1, String team2) {
        this.teamControlList.add(team1);
        this.teamControlList.add(team2);
    }

    public int getTeamsCount() {
        return teamsCount;
    }

    public void setTeamsCount(int teamsCount) {
        this.teamsCount = teamsCount;
    }
}
