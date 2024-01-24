public class Food {
    public String menuItemNumber;
    private String size;

    public Food(String menuItemNumber, String size){
        this.menuItemNumber = menuItemNumber;
        this.size = size;
    }

    public void setMenuItemNumber(String menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMenuItemNumber() { return menuItemNumber;
    }

    public String getSize() { return size;
    }

    public String toString() { return menuItemNumber + ", " + size;
    }
}
