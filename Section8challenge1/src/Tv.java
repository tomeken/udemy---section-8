public class Tv {
    private String manufacturer;
    private String model;
    private int yearOfProduction;

    public Tv(String manufacturer, String model, int yearOfProduction) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
