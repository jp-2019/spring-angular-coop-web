package sample.amory;

public class MSixteen implements Armory{
    private String name = "mSixteen";
    private int rounds = 3;


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
        System.out.println("Kill Sauron");

        return rounds;

    }
}
