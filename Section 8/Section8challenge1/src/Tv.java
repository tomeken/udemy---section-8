public class Tv {
    private String manufacturer;
    private String model;
    private int yearOfProduction;
    private Dimensions dimensions;


    public Tv(String manufacturer, String model, int yearOfProduction, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.dimensions = dimensions;
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

    public void getDimensions() {
        dimensions.showDimensions();
    }
}
