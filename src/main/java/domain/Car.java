package domain;
import enums.FuelType;
import enums.GearboxType;


public class Car {

    private Long id;
    //BMW, Audi...
    private String mark;
    //HF 777 ...
    private String registerNumber;
    //325, 118i...
    private String model;
    //cm^3 1995...
    private int motorCapacity;
    private  String color;
    private FuelType fuelType;
    private GearboxType gearboxType;


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

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearboxType getGearboxType (){
        return gearboxType;
    }
    public void setGearboxType(GearboxType gearBox) {
        this.gearboxType = gearboxType;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
