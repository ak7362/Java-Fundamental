public class VehicalType {

    public static void main(String args[]) {
        // bike
        Vehicle bike = new Vehicle();
        bike.setfuelType("petrol");
        bike.Break();
        bike.Horn();
        System.out.println("fullType: " + bike.getfuelType());
        System.out.println("\n");

        // car
        Vehicle car = new Vehicle("Honda", "city");
        car.setprice(90000);
        System.out.println("price: " + car.getprice());
        car.Horn();
        car.setfuelType("Diesel");
        System.out.println("Fule: " + car.getfuelType());
        System.out.println("\n");

        // Trek
        Vehicle trek = new Vehicle("Tata", "Intra", 1500000);
        trek.setfuelType("Diesel");
        System.out.println("\nFule: " + car.getfuelType());
        trek.Horn();
    }
}

class Vehicle {
    String company;
    String model;
    int price;
    String fuel;

    Vehicle() {
        this.company = "Hero";
        this.model = "Glamour";
        this.price = 75000;
        System.out.print("Bike: " + company);
        System.out.print(", model: " + model);
        System.out.print(", price: " + price);
    }

    Vehicle(String c, String m) {
        this.company = c;
        this.model = m;
        System.out.print("car: " + company);
        System.out.print(", model: " + model);
        // System.out.println("price: "+getprice());
    }

    Vehicle(String c, String m, int p) {
        this.company = c;
        this.model = m;
        this.price = p;
        System.out.print("Trek: " + company);
        System.out.print(", model: " + model);
        System.out.print(", price: " + price);
    }

    public void Break() {
        System.out.println("\nApplied Break!");
    }

    public void Horn() {
        System.out.println("Horn:pee pee poo poo!!");
    }

    public void setfuelType(String s) {
        this.fuel = s;
    }

    public String getfuelType() {
        return fuel;
    }

    public void setprice(int p) {
        this.price = p;
    }

    public int getprice() {
        return price;
    }

}
