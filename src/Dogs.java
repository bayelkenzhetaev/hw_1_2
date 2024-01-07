public class Dogs extends Animals{
    private int year;
    private Colors colors;
    private String name;

    public Dogs(int year, Colors colors, int year1, Colors colors1, String name) {
        super(year, colors);
        this.year = year1;
        this.colors = colors1;
        this.name = name;
    }

    public Dogs(int year, Colors colors, int year1, Colors colors1) {
        super(year, colors);
        this.year = year1;
        this.colors = colors1;
    }

    public Dogs(int year, Colors colors){
        super(year, colors);
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Colors getColors() {
        return colors;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
    public final String name(String name){
        return name;
    }

    public int year(String name,int year){
        return year;
    }
}
