package day12;

public class CarShopping {
    public static void main(String[] args) {

        // Buy Corolla or Tesla (only if it's within the budget)
        // there is only one car covered with cloth
        // we dont know what car it is and what is the price
        // once we take off the cloth
        // we check wether its, toyota, if it's not we buy it without checking the price
        // if its not we check if its a Tesla and also check whether it is within the budget

        String carBrand = "Corolla";
        int carPrice = 30000;
        int budget = 40000;

        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice<=budget)) {
            System.out.println("Car Acquired");
        } else{
            System.out.println("Not what I am looking for");
        }
        }
    }

