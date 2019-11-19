import weaponry.Ak47;
import weaponry.Barrel;
import weaponry.ShotGun;
import weaponry.Warehouse;

public class ArmoryFactory {

    public Warehouse getWarehouse (String weaponryType) {
        if(weaponryType == null ) {
            return null;
        }
        if(weaponryType.equalsIgnoreCase("Ak47")){
            return new Ak47();
        }

        else if(weaponryType.equalsIgnoreCase("Barrel")){
            return new Barrel();
        }
        else if(weaponryType.equalsIgnoreCase("Shotgun")){
            return new ShotGun();
        }
        return null;
    }
}
