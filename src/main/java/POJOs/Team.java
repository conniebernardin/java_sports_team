package POJOs;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    //properties
    private Player[] players;
    private String name;
    private Manager manager;

    //constructor
    public Team(String name, Manager manager){
        this.name = name;
        this.manager = manager;
        this.players = new Player[15]; //don't need to pass players as parameter because teams don't always start with players in them
    }
    //default constructor
    public Team(){
    }

    //getters and setters

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    @Override
    public String
    toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}
