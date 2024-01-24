public class Curry extends Food {
    private String curry;

    public Curry(String menuItemNumber, String size, String curry){
        super(menuItemNumber, size);
        this.curry = curry;
    }

    public void setCurry(){
        this.curry = curry;
    }

    public String getCurry(){
        return curry;
    }

    public String toString(){
        return "Curry: " + super.toString() + ", " + curry;
    }
}
