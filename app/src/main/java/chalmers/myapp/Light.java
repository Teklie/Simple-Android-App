package chalmers.myapp;

public class Light {
    double energyConsumption;
    boolean isOn;

    void Light(double energyConsumption){
        this.energyConsumption = energyConsumption;
        this.isOn = false;

    }
    void TurnOn(){
        this.isOn=true;
    }
    void TurnOff(){
        this.isOn=false;
    }
}
