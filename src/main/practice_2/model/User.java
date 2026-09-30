package main.practice_2.model;
import java.time.LocalDateTime;

public class User {
    private String id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String preferredLanguage;
    private LocalDateTime lastActiveAt;

    public User(){}

    public User(String id, String fullName, String email, String phoneNumber, String preferredLanguage, LocalDateTime lastActiveAt){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.preferredLanguage = preferredLanguage;
        this.lastActiveAt = lastActiveAt;
    }

    public boolean authenticate(String login, String password){
        return false;
    }

    public void sendDeviceCommand(String id, String command){

    }

    public void manageAutomationScenario(String scenarioId, boolean enable){

    }

    public void receiveNotification(String message){

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPreferredLanguage(){
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage){
        this.preferredLanguage = preferredLanguage;
    }

    public LocalDateTime getLastActiveAt(){
        return lastActiveAt;
    }

    public void setLastActiveAt(LocalDateTime lastActiveAt){
        this.lastActiveAt = lastActiveAt;
    }

    public void printInfo(){
        System.out.printf("User{id='%s', fullName='%s', email='%s', phoneNumber='%s', preferredLanguage='%s', lastActiveAt=%s}\n",
                id, fullName, email, phoneNumber, preferredLanguage, lastActiveAt);
    }

}
