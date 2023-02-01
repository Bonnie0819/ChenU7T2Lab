import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot()  {
        inventory = new ArrayList<Car>();
    }
    public ArrayList<Car> getInventory() {
        return inventory;
    }
    public void addCar(Car car) {
        inventory.add(car);
    }
    public boolean swap(int a, int b) {
        if((a > inventory.size() -1 || a < 0) || (b > inventory.size() -1 || b < 0)) {
            return false;
        } else {
            Car replaced = inventory.set(a, inventory.get(b));
            inventory.set(b , replaced);
            return true;
        }
    }
}
