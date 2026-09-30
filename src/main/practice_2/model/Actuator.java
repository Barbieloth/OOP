package main.practice_2.model;

public class Actuator extends SmartDevice{
    private String actuatorType;
    private double state;
    private boolean isLocked;

    public Actuator() {
        super();
    }

    public Actuator(String id, String name, String macAddress, String protocolType, String roomId, boolean isOnline, int batteryLevel, String firmwareVersion, String actuatorType, double state, boolean isLocked) {
        super(id, name, macAddress, protocolType, roomId, isOnline, batteryLevel, firmwareVersion);
        this.actuatorType = actuatorType;
        this.state = state;
        this.isLocked = isLocked;
    }

    public void executeCommand(String command){
    }

    public void reportStatus(){
    }

    public String getActuatorType(){
        return actuatorType;
    }

    public void setActuatorType(String actuatorType){
        this.actuatorType = actuatorType;
    }

    public double getState(){
        return state;
    }

    public void setState(double state){
        this.state = state;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void setLocked(boolean locked){
        isLocked = locked;
    }

    public void printInfo(){
        System.out.printf("Actuator{id='%s', name='%s', macAddress='%s', protocolType='%s', roomId='%s', isOnline=%b, batteryLevel=%d, firmwareVersion='%s', actuatorType='%s', state=%.2f, isLocked=%b}",
                getId(), getName(), getMacAddress(), getProtocolType(), getRoomId(), isOnline(), getBatteryLevel(), getFirmwareVersion(),
                actuatorType, state, isLocked);
    }
}
