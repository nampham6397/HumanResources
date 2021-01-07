public class Employee extends Staff implements ICalculator {
    private int overTime;

    public Employee(String id, String name, int age, Double salaryScale, String startDate, String department, int annualLeave, int overTime) {
        super(id, name, age, salaryScale, startDate, department, annualLeave);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public Double calculateSalary() {
        return (getSalaryScale() * 3000000) + (getOverTime() * 200000);
    }

    @Override
    public String toString() {
        return String.format(Constant.STAFF_CONTENT, getId(), getName(), getAge(), getSalaryScale(), getStartDate(), getDepartment(), getAnnualLeave(), "", getOverTime());
    }
}