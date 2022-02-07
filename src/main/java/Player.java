import java.util.Objects;

public class Player {

    //properties
    private String name;
    private String position;
    private int playerNumber;
    private int contractLength;

    //constructor
    public Player(String name, String position, int playerNumber, int contractLength){
        this.name = name;
        this.position = position;
        this.playerNumber = playerNumber;
        this.contractLength = contractLength;
    }

    //default constructor
    public Player(){

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", playerNumber=" + playerNumber +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerNumber == player.playerNumber && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, playerNumber, contractLength);
    }
}
