package Uppgift5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/car.json"); // vart den ska ligga
        Car car1=new Car("Black", "Volvo","1");
        Car car2= new Car("Silver","BMW","2");
        Car car3= new Car("Red","Mercedes","3");
        Car car4= new Car("Silver","BMW","4");

        List<Car>carList=new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(path.toFile(), carList);

        List<Car> newCar = List.of(mapper.readValue(path.toFile()
                , Car[].class));

        for (Car readCar : newCar) {
            System.out.println(readCar.getColor());
            System.out.println(readCar.getBrand());
            System.out.println(readCar.getNumberOfCars());
        }





    }
}