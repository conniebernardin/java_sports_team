package Services;

import POJOs.Player;
import POJOs.Team;

public class TeamService {

    //method to count empty spaces on team
    //return int
    // parameters: Team
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

    public void addPlayerToTeam(Team team, Player player) {
       int spaces = countEmptySpacesInTeam(team);
       if (spaces > 0){
           //get players array from team class
           Player[] players = team.getPlayers();
           for (int i = 0; i < players.length; i++) {
               if (players[i] == null){
                   players[i]= player;
                   break;
               }
           }
           //add player to first available empty space
           //loop through players array
           // if we find an empty space, add the player then break
       }
    }
}
