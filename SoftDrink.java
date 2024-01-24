public class SoftDrink extends Food{

    private String flavour, bottleCan;

    public SoftDrink(String menuItemNumber, String size, String flavour, String bottleCan){
        super(menuItemNumber, size);
        this.flavour = flavour;
        this.bottleCan = bottleCan;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setBottleCan(String bottleCan) {
        this.bottleCan = bottleCan;
    }

    public String getFlavour(){ return flavour;
    }

    public String getBottleCan() { return bottleCan;
    }

    public String toString() {
        return "Soft Drink: " + super.toString() + ", " + flavour + ", " + bottleCan;
    }
}
