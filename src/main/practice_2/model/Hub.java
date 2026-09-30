package main.practice_2.model;

public class Hub{
    private String id;
    private String ipAddress;
    private int connectedDevicesCount;
    private boolean isCloudSyncEnabled;

    public Hub(){
    }

    public Hub(String id, String ipAddress, int connectedDevicesCount, boolean isCloudSyncEnabled){
        this.id = id;
        this.ipAddress = ipAddress;
        this.connectedDevicesCount = connectedDevicesCount;
        this.isCloudSyncEnabled = isCloudSyncEnabled;
    }

    public void coordinateProtocols(){
    }

    public void pollSensorsAndAggregateTelemetry(){
    }

    public void processScenariosAndGenerateCommands(){
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getIpAddress(){
        return ipAddress;
    }

    public void setIpAddress(String ipAddress){
        this.ipAddress = ipAddress;
    }

    public int getConnectedDevicesCount(){
        return connectedDevicesCount;
    }

    public void setConnectedDevicesCount(int connectedDevicesCount){
        this.connectedDevicesCount = connectedDevicesCount;
    }

    public boolean isCloudSyncEnabled(){
        return isCloudSyncEnabled;
    }

    public void setCloudSyncEnabled(boolean cloudSyncEnabled){
        isCloudSyncEnabled = cloudSyncEnabled;
    }

    public void printInfo() {
        System.out.printf("Hub{id='%s', ipAddress='%s', connectedDevicesCount=%d, isCloudSyncEnabled=%b}",
                id, ipAddress, connectedDevicesCount, isCloudSyncEnabled);
    }
}
