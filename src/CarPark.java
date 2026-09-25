import java.util.ArrayList;
import java.util.List;

public class CarPark {

    List<Vehicle> typecar = new ArrayList<>();


    List<Customer> customers = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {

        typecar.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {

        typecar.remove(vehicle);
    }

    public void showAllVehicle() {
        typecar.forEach(System.out::println);
    }

    public Vehicle findById(int id) {
        return typecar.stream()
                .filter(n -> n.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Vehicle findByBrand(String brand) {
        return typecar.stream()
                .filter(n -> n.getBrand() == brand)
                .findFirst()
                .orElse(null);
    }

    public void showAvailableVehicles() {
        typecar.stream()
                .filter(n -> n.getAvailable())
                .forEach(System.out::println);
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {

        if (customer.getAge() < 18) {
            System.out.println("Аренда доступна только с 18 лет");
            return;
        }

        boolean available = typecar.stream()
                .filter(v -> v.getId() == vehicle.getId())
                .anyMatch(Vehicle::getAvailable);

        if (!available) {
            System.out.println("Автомобиль недоступен");
            return;
        }


        double price = vehicle.getPricePerDay() * days;

        boolean enoughMoney = customers.stream()
                .filter(c -> c.getId() == customer.getId())
                .anyMatch(c -> c.getBalance() >= price);

        if (!enoughMoney) {
            System.out.println("Недостаточно денег");
            return;
        }

        vehicle.setAvailable(false);

        customer.setBalance(customer.getBalance() - price);

        System.out.println("Автомобиль успешно арендован");
    }

    public void addCustomer(Customer cast) {
        this.customers.add(cast);
    }


}
