package main.practice_2.model;
import java.time.LocalDateTime;

public class Sensor extends SmartDevice {
    private String sensorType;
    private double currentValue;
    private String unitOfMeasurement;
    private int samplingIntervalSeconds;
    private LocalDateTime lastTriggeredAt;

    public Sensor() {
        super();
    }

    public Sensor(String id, String name, String macAddress, String protocolType, String roomId, boolean isOnline, int batteryLevel, String firmwareVersion, String sensorType, double currentValue, String unitOfMeasurement, int samplingIntervalSeconds, LocalDateTime lastTriggeredAt) {
        super(id, name, macAddress, protocolType, roomId, isOnline, batteryLevel, firmwareVersion);
        this.sensorType = sensorType;
        this.currentValue = currentValue;
        this.unitOfMeasurement = unitOfMeasurement;
        this.samplingIntervalSeconds = samplingIntervalSeconds;
        this.lastTriggeredAt = lastTriggeredAt;
    }

    public void measureValue(){

    }

    public void calibrateSensitivity(double threshold){

    }

    public void sendAlarm(String alertMessage){

    }

    public String getSensorType(){
        return sensorType;
    }

    public void setSensorType(String sensorType){
        this.sensorType = sensorType;
    }

    public double getCurrentValue(){
        return currentValue;
    }

    public void setCurrentValue(double currentValue){
        this.currentValue = currentValue;
    }

    public String getUnitOfMeasurement(){
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement){
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public int getSamplingIntervalSeconds(){
        return samplingIntervalSeconds;
    }

    public void setSamplingIntervalSeconds(int samplingIntervalSeconds){
        this.samplingIntervalSeconds = samplingIntervalSeconds;
    }

    public LocalDateTime getLastTriggeredAt(){
        return lastTriggeredAt;
    }

    public void setLastTriggeredAt(LocalDateTime lastTriggeredAt){
        this.lastTriggeredAt = lastTriggeredAt;
    }

    public void printInfo(){
        System.out.printf("Sensor{id='%s', name='%s', macAddress='%s', protocolType='%s', roomId='%s', isOnline=%b, batteryLevel=%d, firmwareVersion='%s', sensorType='%s', currentValue=%.2f, unitOfMeasurement='%s', samplingIntervalSeconds=%d, lastTriggeredAt=%s}\n",
                getId(), getName(), getMacAddress(), getProtocolType(), getRoomId(), isOnline(), getBatteryLevel(), getFirmwareVersion(),
                sensorType, currentValue, unitOfMeasurement, samplingIntervalSeconds, lastTriggeredAt);
    }
}
