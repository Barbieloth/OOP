package main.practice_2.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String id;
    private String name;
    private int floor;
    private double squareMeters;
    private double targetTemperature;
    private List<String> deviceList;

    public Room(){
        this.deviceList = new ArrayList<>();
    }

    public Room(String id, String name, int floor, double squareMeters, double targetTemperature, List<String> deviceList) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.squareMeters = squareMeters;
        this.targetTemperature = targetTemperature;
        this.deviceList = deviceList;
    }

    public void executeGroupCommand(String command){

    }

    public void updateClimateTargets(double temperature){

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public double getSquareMeters(){
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters){
        this.squareMeters = squareMeters;
    }

    public double getTargetTemperature(){
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature){
        this.targetTemperature = targetTemperature;
    }

    public List<String> getDeviceList(){
        return deviceList;
    }

    public void setDeviceList(List<String> deviceList){
        this.deviceList = deviceList;
    }

    public void printInfo(){
        System.out.printf("Room{id='%s', name='%s', floor=%d, squareMeters=%.2f, targetTemperature=%.1f, deviceList=%s}\n",
                id, name, floor, squareMeters, targetTemperature, deviceList);
    }
}
