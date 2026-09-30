package main.practice_2;
import java.time.LocalDateTime;
import java.util.Arrays;
import main.practice_2.model.*;

public class Main {
    public static void main() {
        User user = new User("usr_001", "Ярик Великий", "alex@example.com", "+380501234567", "UA", LocalDateTime.now());

        Room room = new Room("room_01", "Вітальня", 1, 24.5, 21.0, Arrays.asList("dev_s01", "dev_a01"));

        SmartDevice smartDevice = new SmartDevice("dev_b01", "Smart Plug", "00:1A:2B:3C:4D:5E", "Zigbee", "room_01", true, 100, "v1.2.0");

        Sensor sensor = new Sensor("dev_s01", "Датчик температури", "AA:BB:CC:11:22:33", "Zigbee", "room_01", true, 85, "v2.0.1", "температура", 22.4, "°C", 60, LocalDateTime.now());

        Actuator actuator = new Actuator("dev_a01", "Розумна лампа", "AA:BB:CC:44:55:66", "Wi-Fi", "room_01", true, 100, "v3.1.0", "освітлення", 1.0, false);

        Hub hub = new Hub("hub_01", "192.168.1.1", 15, true);

        user.printInfo();
        room.printInfo();
        smartDevice.printInfo();
        sensor.printInfo();
        actuator.printInfo();
        hub.printInfo();
    }
}
