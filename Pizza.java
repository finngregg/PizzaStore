public class Pizza extends Food{
    private String base, cheese, garlic;

    public Pizza(String menuItemNumber, String size, String base, String cheese, String garlic){
        super(menuItemNumber, size);
        this.base = base;
        this.cheese = cheese;
        this.garlic = garlic;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getGarlic() {
        return garlic;
    }

    public void setGarlic(String garlic) {
        this.garlic = garlic;
    }

    public String toString(){
        return "Pizza: " + super.toString() + ", " + base + ", " + cheese + ", " + garlic;
    }
}
