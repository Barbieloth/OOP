package main.practice_2.model;

public class SmartDevice {
    private String id;
    private String name;
    private String macAddress;
    private String protocolType;
    private String roomId;
    private boolean isOnline;
    private int batteryLevel;
    private String firmwareVersion;

    public SmartDevice() {
    }

    public SmartDevice(String id, String name, String macAddress, String protocolType, String roomId, boolean isOnline, int batteryLevel, String firmwareVersion) {
        this.id = id;
        this.name = name;
        this.macAddress = macAddress;
        this.protocolType = protocolType;
        this.roomId = roomId;
        this.isOnline = isOnline;
        this.batteryLevel = batteryLevel;
        this.firmwareVersion = firmwareVersion;
    }

    public void checkStatus(){

    }

    public void Ping(){

    }

    public void updateFirmware(String version){

    }

    public void runSelfDiagnostics(){

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

    public String getMacAddress(){
        return macAddress;
    }

    public void setMacAddress(String macAddress){
        this.macAddress = macAddress;
    }

    public String getProtocolType(){
        return protocolType;
    }

    public void setProtocolType(String protocolType){
        this.protocolType = protocolType;
    }

    public String getRoomId(){
        return roomId;
    }

    public void setRoomId(String roomId){
        this.roomId = roomId;
    }

    public boolean isOnline(){
        return isOnline;
    }

    public void setOnline(boolean online){
        isOnline = online;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    public String getFirmwareVersion(){
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion){
        this.firmwareVersion = firmwareVersion;
    }

    public void printInfo(){
        System.out.printf("SmartDevice{id='%s', name='%s', macAddress='%s', protocolType='%s', roomId='%s', isOnline=%b, batteryLevel=%d, firmwareVersion='%s'}\n",
                id, name, macAddress, protocolType, roomId, isOnline, batteryLevel, firmwareVersion);
    }
}
