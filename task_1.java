/*
 * Unit-тесты (семинары)
Урок 2. Знакомство с тестовыми фреймворками

Задание 0. (необязательное) *Попробовать самостоятельно решить задачи, которые не успели решить на семинаре. Сдавать решение не нужно.

Условия к ДЗ (архив)

*Задание 1.
Проект Vehicle. Написать следующие тесты с использованием JUnit5:

- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

- Проверить, что объект Car создается с 4-мя колесами.

- Проверить, что объект Motorcycle создается с 2-мя колесами.

- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".

Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.

Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void carIsInstanceOfVehicle() {
        Car car = new Car();
        assertTrue(car instanceof Vehicle, "Car should be an instance of Vehicle");
    }

    @Test
    public void carHasFourWheels() {
        Car car = new Car();
        assertEquals(4, car.getNumWheels(), "Car should have 4 wheels");
    }

    @Test
    public void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle();
        assertEquals(2, motorcycle.getNumWheels(), "Motorcycle should have 2 wheels");
    }

    @Test
    public void carTestDriveSetsSpeedTo60() {
        Car car = new Car();
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Car should have a speed of 60 after test drive");
    }

    @Test
    public void motorcycleTestDriveSetsSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle should have a speed of 75 after test drive");
    }

    @Test
    public void carStopsAfterParking() {
        Car car = new Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car should stop after parking");
    }

    @Test
    public void motorcycleStopsAfterParking() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle should stop after parking");
    }
}
