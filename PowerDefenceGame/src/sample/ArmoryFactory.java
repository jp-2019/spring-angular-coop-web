package sample;

import sample.amory.ARFifteen;
import sample.amory.Armory;
import sample.amory.MSixteen;
import sample.amory.NineMills;

public class ArmoryFactory {
    public Armory getArmory(String amoryType){
        if(amoryType == null) {
            return null;
        }
        if(amoryType.equalsIgnoreCase("ARFifteen")) {
            return new ARFifteen();

        }

        else if(amoryType.equalsIgnoreCase("MSixteen")) {
            return new MSixteen();

        }
        else if(amoryType.equalsIgnoreCase("NineMills")){
            return new NineMills();
        }
        return null;
    }
}
