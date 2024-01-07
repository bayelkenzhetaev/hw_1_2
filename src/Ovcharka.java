public final class Ovcharka extends Dogs{
    private int year;
    private Colors colors;

    public Ovcharka(int year, Colors colors) {
        super(year, colors);
    }

    public Ovcharka(int year, Colors colors, int year1, Colors colors1, String name, int year2, Colors colors2) {
        super(year, colors, year1, colors1, name);
        this.year = year2;
        this.colors = colors2;
    }

    public Ovcharka(int year, Colors colors, int year1, Colors colors1, int year2, Colors colors2) {
        super(year, colors, year1, colors1);
        this.year = year2;
        this.colors = colors2;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Colors getColors() {
        return colors;
    }

    @Override
    public int year(String name, int year) {
        return super.year(name, year);
    }
}
