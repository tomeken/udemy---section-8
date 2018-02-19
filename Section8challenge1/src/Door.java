public class Door {
    private int height;
    private int weight;
    private int width;
    private String color;
    private Dimensions dimensions;

    public Door(int height, int weight, int width, String color) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
