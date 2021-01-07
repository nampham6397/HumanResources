import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentList {

    // initial data
    private ArrayList<Department> departments = new ArrayList<>();

    // get all data
    public ArrayList<Department> getAll() {
        return departments;
    }

    public DepartmentList() {
        departments.add(new Department("Q1", "IT", 3));
        departments.add(new Department("Q2", "Sale", 2));
        departments.add(new Department("Q3", "Business", 3));
    }

    // display data
    public void displayDepartments() {
        Scanner in = new Scanner(System.in);
                int choice;
                do {
                    System.out.print("Do you want to create departments: 1 = Create, 2 = Display ");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            in.nextLine();
                            System.out.print("Enter department ID: ");
                            String id = in.nextLine();

                            System.out.print("Enter department name: ");
                            String name = in.nextLine();

                            System.out.print("Enter total Employees: ");
                            int totalEmployees = in.nextInt();
                            System.out.println("Add department successfully");
                            departments.add(new Department(id, name, totalEmployees));
                            break;

                        //if department list is empty
                        case 2:
                            if (departments.isEmpty()) {
                                System.out.println("Sorry! There is no department created yet");
                            } else {
                                System.out.println(Department.getHeader());
                                for (Department e : departments) {
                                    System.out.println(e.toString());
                                }
                            }
                            break;
                    }
                } while (choice == 1);
    }
}
