import POJOs.Manager;
import POJOs.Player;
import POJOs.Team;
import Services.TeamService;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Fin Russell", "Fly Half", 10, 12);
        Manager manager = new Manager("Gregor Townsend");
        Team scotland =  new Team("Scotland", manager);

        TeamService teamService = new TeamService();
        int spaces = teamService.countEmptySpacesInTeam(scotland);
        System.out.println(spaces);
    }
}
