package Services;

import POJOs.Player;
import POJOs.Team;

public class TeamService {

    public int countEmptySpacesInTeam(Team team) {
        // temporary variable to store counts
        int counter = 0;
        //loop through player array to check for nulls
        for (Player player : team.getPlayers()) { //for each player object in players Array (accessed through team class)
            //if statement
            if (player == null){
                counter ++;

                /* could also use:
                 count += 1;
                 count = count + 1; */

        //alternative loop using i index
//        Player players [] = team.getPlayers();
//           for (int i =0; i < players.length; i ++){
//               if (players[i] == null){
//                   counter ++;
            }
        }
        return counter;
    }
}
//method to count empty spaces on team
//return int
// parameters: Team

