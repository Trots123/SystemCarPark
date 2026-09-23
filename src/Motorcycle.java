public class Motorcycle extends Vehicle {
    public Motorcycle(int id, String brand, String model, int year, int pricePerDay, boolean available) {
        super(id, brand, model, year, pricePerDay, available);
    }

    @Override
    public double getPricePerDay() {
        return super.getPricePerDay() * 0.9;
    }

    @Override
    void showInfo() {
        System.out.println("id : " + getId() + "brand : " + getBrand() + "model : "+ getModel() + "year : " + getYear()+ " pricePerDay : " + getPricePerDay()+ "available : "+getAvailable());
    }




}
