package com.company;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(TypeCar.GENERAL, 1000),
                new Car(TypeCar.GENERAL, 120000),
                new Car(TypeCar.GENERAL, 25000),
                new Car(TypeCar.SPORT, 100000),
                new Car(TypeCar.SPORT, 50000),
                new Car(TypeCar.SPORT, 150000)

        };
        System.out.println("Количество обычных машин: " + countOfCar(cars, (Car car)->car.getType()==TypeCar.GENERAL));
        System.out.println("Количество спортивных машин: " + countOfCar(cars, (Car car)->car.getType()==TypeCar.SPORT));
        System.out.println("Количество дорогих машин: " + countOfCar(cars, (Car car)->car.getPrice()>100000));
        System.out.println("Количество дешевых машин: " + countOfCar(cars, (Car car)->car.getPrice()<1000));

    }
    public static int countOfCar(Car[] cars, SearchOfCar search ){
        int counter = 0;

        for(Car item: cars){
            if(search.test(item)){
                counter++;
            }
        }
        return counter;
    }
}
