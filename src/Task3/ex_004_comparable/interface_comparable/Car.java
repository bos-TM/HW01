package Task3.ex_004_comparable.interface_comparable;

public class Car implements Comparable<Car> { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car other) {    // public int compareTo(Car o) {
        if (this.speed != other.speed) {
            return this.speed - other.speed;
        } else if (this.price != other.price) {
            return this.price - other.price;
        } else if (!this.model.equals(other.model)) {
            return this.model.compareTo(other.model);
        } else {
            return this.color.compareTo(other.color);
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}