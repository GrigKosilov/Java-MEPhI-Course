package ru.mephi.java.chapter01.lab02.ex09;

// Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
// Предоставьте методы для передвижения автомобиля на заданное количество километров, заполнения топливного бака
// заданным количеством литров бензина, вычисления расстояния, пройденного от начала координат, а также уровня
// топлива в баке. Укажите расход топлива (в км/л) в качестве параметра конструктора данного класса.
// Должен ли этот класс быть неизменяемым и почему?

public class Class09 {

    public static class Car {
        private final double consumptionRate;
        private double fuel;
        private double distance = 0;

        public Car(double consumptionRate, double fuel) {
            this.consumptionRate = consumptionRate;
            this.fuel = fuel;
        }

        public Car(double consumptionRate) {
            this(consumptionRate, 10);
        }

        public double getFuel() {
            return this.fuel;
        }

        public double getDistance() {
            return this.distance;
        }

        public void drive(double distance) {
            double fuelNeeded = distance / this.consumptionRate;
            if (fuelNeeded > this.fuel) {
                System.out.println("Not enough fuel. You need " + fuelNeeded + " fuel to drive " + distance + ", but you only have " + this.fuel);
            } else {
                this.distance += distance;
                this.fuel -= fuelNeeded;
            }
        }

        public void refuel(double fuel) {
            this.fuel += fuel;
        }

    }

}
