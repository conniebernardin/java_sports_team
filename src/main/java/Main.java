import POJOs.Manager;
import POJOs.Player;
import POJOs.Team;
import Services.TeamService;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Fin Russell", "Fly Half", 10, 12);
        Manager manager = new Manager("Gregor Townsend");
        Team scotland =  new Team("Scotland", manager);

        //calling count empty spaces method on Scotland team
        TeamService teamService = new TeamService();
        int spacesBefore = teamService.countEmptySpacesInTeam(scotland);
        System.out.println(spacesBefore);


        teamService.addPlayerToTeam(scotland, player);

        int spacesAfter = teamService.countEmptySpacesInTeam(scotland);
        System.out.println(spacesAfter);
    }
}
