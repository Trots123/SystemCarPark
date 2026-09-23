public class Truck extends Vehicle{
    public Truck(int id, String brand, String model, int year, int pricePerDay, boolean available) {
        super(id, brand, model, year, pricePerDay, available);
    }


    @Override
    public double getPricePerDay() {
        return super.getPricePerDay() + 50 ;
    }
    @Override
    void showInfo() {
        System.out.println("id : " + getId() + "brand : " + getBrand() + "model : "+ getModel() + "year : " + getYear()+ " pricePerDay : " + getPricePerDay()+ "available : "+getAvailable());
    }
}
