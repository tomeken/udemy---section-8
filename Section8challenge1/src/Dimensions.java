public class Dimensions {
    int width;
    int height;

    public Dimensions(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void showDimensions(){
        System.out.println("|||||||||||||||||||||||||||");
        System.out.println("height: " + height + " widtd: " + width );
        System.out.println("|||||||||||||||||||||||||||");
    }
}
