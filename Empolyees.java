import java.util.Scanner;
import java.util.UUID;
public class Empolyees extends Shoowrrom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details()
    {
        System.out.println("ID:"+ emp_id);
        System.out.println("Name:"+emp_name);
        System.out.println("Age"+emp_age);
        System.out.println("Department:"+emp_department);
        System.out.println("showroom name:"+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();

        emp_id = String.valueOf(uuid);

        System.out.println("========= *** Enter Empolyee details *** ======== ");
        System.out.println();
        System.out.println("Empolyees name:");
        emp_name = sc.nextLine();
        System.out.println("Empolyee Age:");
        emp_age = sc.nextInt();
        System.out.println("Empolyee department : ");
        emp_department = sc.nextLine();
        System.out.println("Showroom Name:");
        showroom_name = sc.nextLine();
    }
}

