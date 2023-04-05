package encapsulationTest;

public class Player {

    private String pName;
    private int pAge;
    private String gameType;

    public Player(String pName, int pAge, String gameType){

        this.pName = pName;
        this.pAge = pAge;
        this.gameType = gameType;

    }

    public String getGameType() {
        return gameType;
    }

    public int getpAge() {
        return pAge;
    }

    public String getpName() {
        return pName;
    }

}

// https://www.scientecheasy.com/2020/05/encapsulation-program-in-java.html/