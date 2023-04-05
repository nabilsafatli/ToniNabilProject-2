package encapsulationTest;

public class PlayerTest {

    public static void main(String[] args){

        Player ply = new Player("Benny",5,"Esports");

        String plyName = ply.getpName();
        int plyAge = ply.getpAge();
        String plyGameType = ply.getGameType();

        System.out.println("Player Name "+ plyName);
        System.out.println("Player Age " + plyAge);
        System.out.println("Player GameType "+ plyGameType);

    }

}
