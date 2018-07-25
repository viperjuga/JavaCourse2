package domain;
import enums.Fuel;
import enums.Gearbox;


public class Car {
    //BMW, Audi...
    private String mark;
    //HF 777 ...
    private String registerNumber;
    //325, 118i...
    private String model;
    //cm^3 1995...
    private int motorCapacity;
    private  String color;
    private Fuel fuelType;
    private Gearbox gearbox;


    public String getMark (){
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(int motorCapacity) {
        this.motorCapacity = motorCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Gearbox getGearbox (){
        return gearbox;
    }
    public void setGearbox(Gearbox gearBox) {
        this.gearbox = gearbox;
    }
}
