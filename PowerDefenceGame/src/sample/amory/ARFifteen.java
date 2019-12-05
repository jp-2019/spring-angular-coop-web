package sample.amory;

public class ARFifteen implements Armory{
    private String name = "aRFifteen";
    private int rounds = 10;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRounds() {
        return rounds;
    }

    @Override
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public int shoot() {
        System.out.println("Kill orks");
        return rounds;

    }
}
