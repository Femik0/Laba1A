package SirenkoAlexandr_2kurs_10gruppa;

public class Apple extends Food {
    private String size;
    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }
// вместо размера яблоко offsize big сьедено
    public void consume() {

        System.out.println(this + " съедено");
    }
    public String getSize() {

        return size;
    }
    public void setSize(String size) {

        this.size = size;
    }
    public String toString() {
        return super.toString() + " Offsize '" + size.toUpperCase() + "'";
    }
}