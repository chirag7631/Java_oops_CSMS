import java.util.Scanner;
public class Cars extends Shoowrrom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String Car_type;
    String car_transmission;

    @Override
    public void get_details()
    {
        System.out.println("Name:"+car_name);
        System.out.println("color of the car:"+car_color);
        System.out.println("fuel type:"+car_fuel_type);
        System.out.println("price of the car:"+car_price);
        System.out.println("type of the car:"+Car_type);
        System.out.println("transmission type : " + car_transmission);
    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        Car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_stocks++;

    }
}
