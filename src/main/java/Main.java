import POJOs.Manager;
import POJOs.Player;
import POJOs.Team;
import Services.TeamService;

public class Main {

    public static void main(String[] args) {

        Player Rachel = new Player("Rachel Cook", "Blindside Flanker", 10, 12);
        Player Abi = new Player("Abi Evans", "Left Wing", 12, 24);
        Player Sarah = new Player("Sarah Law", "Scrum Half", 02, 4);
        Player Lisa = new Player("Lisa Martin", "Inside Centre", 13, 12);
        Player Heather = new Player("Heather Lockheart", "Loosehead Prop", 05, 8);

        Player SarahB = new Player("Sarah Bern", "Prop", 06, 12);
        Player Hannah = new Player("Hannah Botterman", "Prop", 02, 24);
        Player Vicky = new Player("Vicky Fleetwood", "Flanker", 13, 16);
        Player Connie = new Player("Connie Powell", "Hooker", 01, 10);

        Manager Caroline = new Manager("Caroline Sport");
        Manager Sophie = new Manager("Sophie Rugby");
        Team scotland =  new Team("Scotland", Caroline);
        Team england =  new Team("England", Sophie);

        //calling count empty spaces method on Scotland team
        TeamService teamService = new TeamService();
        System.out.println("Scotland Team Capacity:");
        System.out.println("------------------------");
        int spacesBeforeScotland = teamService.countEmptySpacesInTeam(scotland);
        System.out.println(spacesBeforeScotland);

        try {
            teamService.addPlayerToTeam(scotland, Rachel);
            teamService.addPlayerToTeam(scotland, Abi);
            teamService.addPlayerToTeam(scotland, Sarah);
            teamService.addPlayerToTeam(scotland, Lisa);
            teamService.addPlayerToTeam(scotland, Heather);
            teamService.addPlayerToTeam(england, SarahB);
            teamService.addPlayerToTeam(england, Hannah);
            teamService.addPlayerToTeam(england, Vicky);
            teamService.addPlayerToTeam(england, Connie);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int spacesAfterScotland = teamService.countEmptySpacesInTeam(scotland);
        System.out.println(spacesAfterScotland);
        System.out.println("Who plays for Scotland?");
        System.out.println(scotland);

        System.out.println("Who plays for England?");
        System.out.println(england);
    }
}
