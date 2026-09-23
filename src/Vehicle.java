public abstract class Vehicle implements Rentable {

    private int id;
    private String brand;
    private String model;
    private int year;
    private double pricePerDay = 100 ;
    private boolean available;

    public Vehicle(int id, String brand, String model, int year, int pricePerDay, boolean available) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    abstract void showInfo();


    @Override
    public void rent() {
        available = false;
    }

    @Override
    public void returnVehicle() {
        available = true;
    }



}
