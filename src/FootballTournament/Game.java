package FootballTournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int teamsCount;
    private List<String> teams;


    public Game(int teamsCount) {
        this.teamsCount = teamsCount;
        teams = new ArrayList<>();
        System.out.println("---TAKIMLARI GİRİNİZ---");
        System.out.println("**");
        createTeams();
        System.out.println("**");
        System.out.println("Takımlar : ");
        teamsList();
    }

    public void start() {
        System.out.println("***** TURNUVA MAÇLARI *****");
        System.out.println("Takım Sayısı : " + teams.size());
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

    public int getTeamsCount() {
        return teamsCount;
    }

    public void setTeamsCount(int teamsCount) {
        this.teamsCount = teamsCount;
    }
}
