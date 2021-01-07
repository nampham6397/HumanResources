import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StaffList {
    private ArrayList<Staff> listOfStaff = new ArrayList<>();

    public ArrayList<Staff> getListOfStaff(){
        return listOfStaff;
    }

    public StaffList() {
        listOfStaff.add(new Employee("E2", "Carl", 21, 2.5, "22/02", "IT", 21, 9 ));
        listOfStaff.add(new Employee("E1", "John", 21, 2.1, "22/01", "IT", 12, 8 ));
        listOfStaff.add(new Manager("A1", "Kim", 31, 3.2, "12/09", "Business", 13, "Business Leader"));
    }

    public void add(Staff m) {
        listOfStaff.add(m);
    }

    //display Staff list
    public void displayEmployees() {
        if (listOfStaff.isEmpty()) {
            System.out.println("Sorry! There is no staff created yet");
        } else {
            System.out.println(String.format(Constant.STAFF_HEADER, "ID", "Name", "Age", "SalaryScale", "StartDate", "Department", "AnnualLeave", "Title", "Overtime"));
            for (Staff m : listOfStaff) {
                System.out.println(m);
            }
        }
    }

    // add Employee or Manager
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee or Manager (1 = Employee, 2 = Manager): ");

        // get choice
        int choice = scanner.nextInt();
        scanner.nextLine();

        // get id
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        // get name
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // get age
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // get salary scale
        System.out.print("Enter Salary Scale: ");
        Double salaryScale = scanner.nextDouble();
        scanner.nextLine();

        // get start date
        System.out.print("Enter StartDate: ");
        String startDate = scanner.nextLine();

        // get department
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        // get annual leave
        System.out.print("Enter Annual Leave: ");
        int annualLeave = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            // get overtime
            System.out.print("Enter Overtime: ");
            int overTime = scanner.nextInt();
            listOfStaff.add(new Employee(id, name, age, salaryScale, startDate, department, annualLeave, overTime));
        } else {
            // get title
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();
            listOfStaff.add(new Manager(id, name, age, salaryScale, startDate, department, annualLeave, title));
        }
        System.out.println("Add employee successfully");
    }

    public void displayByDepartment(String department) {
        List<Staff> foundStaffs = new ArrayList<>();

        // find department name
        for (Staff e : listOfStaff) {
            if (e.getDepartment().equalsIgnoreCase(department)) {
                foundStaffs.add(e);
            }
        }

        // print data
        if (!foundStaffs.isEmpty()) {
            System.out.println(department + " Staffs");
            System.out.println(String.format(Constant.STAFF_HEADER, "ID", "Name", "Age", "SalaryScale", "StartDate", "Department", "AnnualLeave", "Title", "Overtime"));
            for (Staff e : foundStaffs) {
                System.out.println(e);
            }
        }
    }

    //display Staff by department
    public void displayEmployeesByDepartment(DepartmentList departmentList) {
        for (Department department : departmentList.getAll()) {
            System.out.println();
            displayByDepartment(department.getName());
        }
    }

    //search staff method
    public void searchStaffBy(String searchType){
        Scanner sc = new Scanner(System.in);
        if(searchType=="name"){
            System.out.print("Enter the name to search: ");
            String nameToSearch = sc.nextLine();
            searchStaffByName(nameToSearch);
        } else if(searchType=="id"){
            System.out.print("Enter id to search: ");
            String idToSearch = sc.nextLine();
            searchStaffById(idToSearch);
        }
    }

    //search Staff by Name
    public void searchStaffByName(String searchName){
        ArrayList<Staff> staffFound = new ArrayList<>();

        for(Staff aStaff : listOfStaff){
            if(aStaff.getName().toLowerCase().contains(searchName.toLowerCase())){
                staffFound.add(aStaff);
            }
        }
        if(!staffFound.isEmpty()){
            System.out.println(String.format(Constant.STAFF_HEADER, "ID", "Name", "Age", "SalaryScale", "StartDate", "Department", "AnnualLeave", "Title", "Overtime"));
            for (Staff aStaff : staffFound) {
                System.out.println(aStaff.toString());
            }
        } else {
            System.out.println("Sorry! There is no staff found");
        }
    }

    //search Staff by ID
    public void searchStaffById(String searchID){
        ArrayList<Staff> staffFound = new ArrayList<>();

        for(Staff aStaff : listOfStaff){
            if(aStaff.getId().toLowerCase().equals(searchID.toLowerCase())){
                staffFound.add(aStaff);
            }
        }
        if(!staffFound.isEmpty()){
            System.out.println(String.format(Constant.STAFF_HEADER, "ID", "Name", "Age", "SalaryScale", "StartDate", "Department", "AnnualLeave", "Title", "Overtime"));
            for (Staff aStaff : staffFound) {
                System.out.println(aStaff.toString());
            }
        } else {
            System.out.println("Sorry! There is no staff found");
        }
    }

    // display and sort Salary
    public void displaySalary(Boolean isSort) {
        System.out.println();
        // print header
        System.out.println(String.format("%-10s %-15s %-20s", "ID", "Name", "Salary"));
        List<Staff> listOfStaff = getListOfStaff();
        for(Staff aStaff : listOfStaff){
            System.out.println(String.format("%-10s %-15s %-20.2f", aStaff.getId(), aStaff.getName(), aStaff.calculateSalary()));
        }
        if (isSort){
            listOfStaff.sort((c1, c2) -> (int) (c1.calculateSalary() - c2.calculateSalary()));
        }
    }
}


