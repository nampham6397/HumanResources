public class Manager extends Staff implements ICalculator {
    private String title;

    public Manager(String id, String name, int age, Double salaryScale, String startDate, String department, int annualLeave, String title) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Double calculateSalary() {
        return (getSalaryScale() * 5000000) +
                (getTitle() == "Business Leader" ? 8000000 : getTitle() == "Project Leader" ? 5000000 : 6000000);
    }

    @Override
    public String toString() {
        return String.format(Constant.STAFF_CONTENT, getId(), getName(), getAge(), getSalaryScale(), getStartDate(), getDepartment(), getAnnualLeave(), getTitle(), 0);
    }
}