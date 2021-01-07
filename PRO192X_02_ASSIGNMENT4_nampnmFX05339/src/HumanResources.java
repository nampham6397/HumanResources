import java.util.Scanner;

public class HumanResources {
    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to the Human Resources program.\n");

        StaffList staffList = new StaffList();
        DepartmentList departmentList = new DepartmentList();
        // choice number
        int choice;

        // exit flag
        Boolean shouldExit = false;

        // scanner
        Scanner scanner = new Scanner(System.in);

        //loop for playing the game
        do {
            System.out.println("Please choose number [1, 2, 3, 4, 5, 6, 7, 8]");
            System.out.println("1. Display employees");
            System.out.println("2. Display departments");
            System.out.println("3. Display employees by departments");
            System.out.println("4. Enter a new employee");
            System.out.println("5. Search employees by name or id");
            System.out.println("6. Display salary");
            System.out.println("7. Display salary by order ascending");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    staffList.displayEmployees();//done
                    break;
                case 2:
                    departmentList.displayDepartments();//done
                    break;
                case 3:
                    staffList.displayEmployeesByDepartment(departmentList);//done
                    break;
                case 4:
                    staffList.addEmployee();//done
                    break;
                case 5:
                    System.out.println("\t1. Search by name");
                    System.out.println("\t2. Search by ID");
                    System.out.print("Your choice: ");
                    int searchChoice = scanner.nextInt();
                    switch (searchChoice) {
                        case 1:
                            staffList.searchStaffBy("name");
                            break;
                        case 2:
                            staffList.searchStaffBy("id");
                            break;
                    }
                    break;
                case 6:
                    staffList.displaySalary(false);
                    break;
                case 7:
                    staffList.displaySalary(true);
                    break;
                case 8:
                    shouldExit = true;
                    break;
            }
        } while (!shouldExit);
        System.out.println("Thank you for visiting this program!");
    }
}
