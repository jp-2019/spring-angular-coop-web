import weaponry.Warehouse;

public class main {
    public static void main(String[] args) {
        ArmoryFactory af = new ArmoryFactory();
        Warehouse arm = af.getWarehouse("ShotGun");
        arm.shoot();
    }
}
