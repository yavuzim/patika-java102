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
        teams = new ArrayList<>();
        if (teamsCount % 2 != 0) {
            teams.add("Bay");
            teamsCount += 1;
        }
        this.teamsCount = teamsCount;
        random = new Random();
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
        for (int i = 0; i < (this.teamsCount - 1) * 2; i++) {
            this.firsRound.add(null);
            this.secondRound.add(null);
        }
        System.out.println(firsRound);
        System.out.println(secondRound);
        Line.draw(8, "-");
        int index = 0;
        for (int i = 1; i <= this.teamsCount - 1; i++) { // 1.yarı hafta sayısı
            for (int j = 0; j < this.teamsCount / 2; j++) { // İlgili haftada kaç maçın olacağı.
                this.generateIndex();
                if (this.roundTeamCount() < this.teamsCount) { // 1.hafta ise
                    while (this.teamControl(i)) {
                        this.generateIndex();
                    }
                } else { // 1.haftadan sonra ise
                    boolean flag = false;
                    while (flag == false) {
                        while (this.teamControl(i)) {
                            this.generateIndex();
                        }
                        String team = this.teams.get(this.home);
                        int teamIndex = -1;
                        for (int k = 0; k < this.roundTeamCount(); k++) {
                            if (team.equals(this.firsRound.get(k))) {
                                teamIndex = k;
                                if (teamIndex % 2 == 0)
                                    teamIndex -= 1;
                                else teamIndex += 1;

                                if (this.teams.get(this.away).equals(this.firsRound.get(teamIndex))) {
                                    flag = false;
                                    break;
                                } else flag = true;
                            }
                        }
                    }
                }
                this.competitionCreate(index, index + 1, this.teams.get(this.home), this.teams.get(this.away));
                index += 2;
            }
        }
        this.print(this.firsRound, this.secondRound);
    }

    private boolean teamControl(int i) {
        boolean flag = false;
        int start = (this.roundTeamCount() * i) - this.roundTeamCount();
        int finish = this.roundTeamCount() * i;
        for (int k = start; k < finish; k++) {
            if(this.firsRound.get(k) == null) break;
            if (this.teams.get(this.home).equals(this.firsRound.get(k)) || this.teams.get(this.away).equals(this.firsRound.get(k))) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    private void competitionCreate(int a, int b, String team1, String team2) {
        this.firsRound.set(a, team1);
        this.firsRound.set(b, team2);
        this.secondRound.set(a, team2);
        this.secondRound.set(b, team1);
    }

    private void generateIndex() {
        this.home = -1;
        this.away = -1;
        while (this.home == this.away) {
            this.home = this.random.nextInt(0, this.teams.size());
            this.away = this.random.nextInt(0, this.teams.size());
        }
    }

    private void createTeams() {
        for (int i = 0; i < this.getTeamsCount(); i++) {
            System.out.print("Takım Adı : ");
            String team = Input.in.nextLine();
            teams.add(team);
        }
    }

    private void print(List<String> firsRound, List<String> secondRound) {
        int n = 0;
        for (int i = 1; i <= this.teamsCount - 1; i++) {
            System.out.println(i + ". Hafta");
            for (int j = this.teamsCount * i - this.teamsCount; j < this.teamsCount * i; j++) {
                System.out.println(firsRound.get(j) + " vs " + firsRound.get(j + 1));
                Line.draw(5, "-");
            }
        }
        Line.draw(5, "*");
        System.out.println("İKİNCİ TUR");
        Line.draw(5, "*");
        for (int i = 1; i <= this.teamsCount - 1; i++) {
            System.out.println(i + ". Hafta");
            for (int j = this.teamsCount * i - this.teamsCount; j < this.teamsCount * i; j++) {
                System.out.println(secondRound.get(j) + " vs " + secondRound.get(j + 1));
                Line.draw(5, "-");
            }
        }
    }

    private int roundTeamCount() {
        int count = 0;
        while (this.firsRound.get(count) != null)
            count++;
        return count;
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
