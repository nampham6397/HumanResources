public abstract class Staff implements ICalculator {
    String id, name;
    int age;
    Double salaryScale;
    String startDate, department;
    int annualLeave;

    public Staff(String id, String name, int age, Double salaryScale, String startDate, String department, int annualLeave) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salaryScale = salaryScale;
        this.startDate = startDate;
        this.department = department;
        this.annualLeave = annualLeave;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(Double salaryScale) {
        this.salaryScale = salaryScale;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(int annualLeave) {
        this.annualLeave = annualLeave;
    }

    @Override
    public abstract Double calculateSalary();

    public abstract String toString();
}

