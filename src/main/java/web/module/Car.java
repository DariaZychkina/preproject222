package web.module;



public class Car {
    private String model;
    private String color;
    private int countOfDoors;

    public Car(String model, String color, int countOfDoors) {
        this.model = model;
        this.color = color;
        this.countOfDoors = countOfDoors;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public Integer getCountOfDoors() {
        return countOfDoors;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }
}
