package sample.amory;

public class NineMills implements Armory{
    private String name = "nineMills";
      int rounds = 4;



    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRounds(){
        return  rounds;
    }

    @Override

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public int shoot() {


            rounds--;
            setRounds(rounds);
            System.out.println(rounds);


            return rounds;
        }

    }

