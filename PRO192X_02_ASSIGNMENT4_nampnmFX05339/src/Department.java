public class Department {
    private String id;
    private String name;
    private int totalEmployees;


    public Department(String id, String name, int totalEmployees) {
        this.id = id;
        this.name = name;
        this.totalEmployees = totalEmployees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public static String getHeader() {
        return String.format(Constant.HEADER, "ID", "Name", "Total Employees");
    }

    @Override
    public String toString() {
        return String.format(Constant.STRING_FORMAT, getId(), getName(), getTotalEmployees());
    }
}

