import java.sql.SQLOutput;
import java.util.Scanner;
public class Shoowrrom  implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars;
    String manager_name;
    int total_cars_stocks =0;


    @Override
    public void get_details() {
        System.out.println("showroom name : " +showroom_name);
        System.out.println("showroom address:"+showroom_address);
        System.out.println("manager_name:"+manager_name);
        System.out.println("total empolyees:"+total_employees);
        System.out.println("total cars:"+total_cars);

    }
    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= *** Enter showroom details *** ======");
        System.out.println();
        System.out.println("showroom name: ");
        showroom_name = sc.nextLine();
        System.out.println("showroom address:");
        showroom_address = sc.nextLine();
        System.out.println("Manager_name :");
        manager_name = sc.nextLine();
        System.out.println("total no of empolyees:");
        total_employees = sc.nextInt();
        System.out.println("total no of cars:");
        total_cars = sc.nextInt();

    }
}
