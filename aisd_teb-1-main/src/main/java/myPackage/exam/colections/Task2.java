package myPackage.exam.colections;

import java.util.*;

public class Task2 {

    static Car car1 = new Car(true, 2019, 3, 0, 95000);
    static Car car2 = new Car(false, 2008, 1, 1, 40000);
    static Car car3 = new Car(false, 2002, 1, 2, 27000);
    static Car car4 = new Car(true, 2021, 3, 3, 150000);
    static Car car5 = new Car(false, 2010, 2, 4, 55000);
    static Car car6 = new Car(true, 2021, 3, 5, 125000);
    static Car car7 = new Car(true, 2019, 2, 6, 70000);
    static Car car8 = new Car(true, 2019, 3, 7, 90000);
    static Car car9 = new Car(false, 2007, 1, 8, 38000);
    static Car car10 = new Car(true, 2019, 2, 9, 110000);
    static Car car11 = new Car(false, 2015, 2, 10, 61000);
    static Car car12 = new Car(true, 2021, 3, 11, 119000);
    static Car car13 = new Car(false, 2006, 1, 12, 25000);

    private static List<Car> carList = new LinkedList<>(Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13));
    public static void getCarList() {
        Collections.sort(carList);
        for (Car cars : carList) {
            System.out.println(cars);
        }
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment){
        List<Car> filterCars = new LinkedList<>();
        for (Car car : carList) {
            if(car.getValue() <= maxValue && Objects.equals(car.getLevelOfEquipment(), levelOfEquipment)) {
                filterCars.add(car);
            }
        }
        Collections.sort(filterCars);
        for (Car cars : filterCars) {
            System.out.println(cars);
        }
    }

    public static void addCarsToList() {
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
    }

    public static void removeCarFromList() {
        //todo

        carList.remove(car6);
        carList.remove(car8);
    }

    public static void printCarListAfterSomeModification(){


        addCarsToList();
        removeCarFromList();
        for (Car modifiedCars : carList) {
            System.out.println(modifiedCars);
        }
    }


}