public class Car extends Vehicle {


    public Car(int id, String brand, String model, int year, int pricePerDay, boolean available) {
        super(id, brand, model, year, pricePerDay, available);
    }

    @Override
    void showInfo() {
        System.out.println("id : " + getId() + "brand : " + getBrand() + "model : "+ getModel() + "year : " + getYear()+ " pricePerDay : " + getPricePerDay()+ "available : "+getAvailable());
    }



}
