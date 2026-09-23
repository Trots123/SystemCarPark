import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalService {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        CarPark carPark = new CarPark();

        Vehicle car = new Car (1, "BMW", "X3",2012 ,100,true);
        Vehicle car2 = new Car (2, "BMW", "X5",2017 ,100,true);
        Vehicle car3 = new Car (3, "BMW", "X1",2014 ,100,true);

        System.out.println("Регистрация пользователя ");

        System.out.print("Придумайте ID: ");
        int idsc = scan.nextInt();

        System.out.print("Введите свое имя : ");
        String namesc= scan.nextLine();

        System.out.print("Введите свой возраст : ");
        int agesc = scan.nextInt();

        System.out.print("Какой у вас бюджет ? : ");
        int Balanssc = scan.nextInt();

        Customer cast = new Customer (idsc,namesc,agesc,Balanssc);







        System.out.println("Выберете услугу \n" +
                " 1. Показать все транспортные средства \n" +
                " 2. Показать доступные транспортные средства \n" +
                " 3. Найти транспортное средство \n" +
                "4. Арендовать транспортное средство \n" +
                " 5. Добавить транспортное средство\n" +
                "6. Выйти");


        int s = scan.nextInt();
        switch (s) {
            case 1:
                carPark.showAllVehicle();
                break;

            case 2:
                carPark.showAvailableVehicles();
                break;
            case 3:
                System.out.print("Введите ID: ");
                int id = scan.nextInt();

                Vehicle vehicle = carPark.findById(id);

                if (vehicle != null) {
                    System.out.println(vehicle);
                } else {
                    System.out.println("Транспортное средство не найдено");
                }
                break;
            case 4:
                System.out.println("Аренда транспортного средства");
                System.out.print("Введите ID транспортного средства: ");
                int vehicleId = scan.nextInt();

                Vehicle carParkById = carPark.findById(vehicleId);

                if (carParkById == null) {
                    System.out.println("Транспортное средство не найдено");
                    break;
                }

                System.out.print("Введите количество дней: ");
                int days = scan.nextInt();

                carPark.rentVehicle(cast, carParkById, days);

            case 5:
                System.out.print("Введите ID: ");
                int ids = scan.nextInt();

                System.out.print("Введите марку: ");
                String brand = scan.nextLine();

                System.out.print("Введите модель: ");
                String modelS = scan.nextLine();

                System.out.print("Введите модель: ");
                int yearS = scan.nextInt();

                System.out.print("Введите цену за день: ");
                double priceS = scan.nextDouble();

                Vehicle carr= new Car (ids, brand,modelS, yearS , (int) priceS, true);

                carPark.addVehicle(carr);

                System.out.println("Автомобиль добавлен");
                break;

            case 6:
                System.out.println("Программа завершена");
                scan.close();
                return;

            default:
                System.out.println("Неверный пункт меню");
        }
    }


}
}
