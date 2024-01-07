public class Animals {
    private int year;
    private Colors colors;

    public Animals(int year, Colors colors) {
        this.year = year;
        this.colors = colors;
    }

    public int getYear() {
        return year;
    }

    public Colors getColors() {
        return colors;
    }

    public String getInfo() {
        return "Color: " + colors + " Years: " + year;
    }
}
