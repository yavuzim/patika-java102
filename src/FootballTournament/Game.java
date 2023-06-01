package FootballTournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private int teamsCount;
    private List<String> teams;
    private Random random;
    private List<String> firsRound;
    private List<String> secondRound;
    private int rnd;


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
        List<String> temp = this.teams;
        for (int i = 0; i < (this.teams.size() + 4) / 2; i++) {
            for (int j = 0; j < this.teams.size(); j += 2) {
                
            }
        }
        System.out.println(firsRound);
        System.out.println(secondRound);
    }

    private void createTeams() {
        for (int i = 0; i < this.getTeamsCount(); i++) {
            System.out.print("Takım Adı : ");
            String team = Input.in.nextLine();
            teams.add(team);
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
