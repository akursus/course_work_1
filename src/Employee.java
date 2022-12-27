import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private String surnameEmployee;
    private String middlenameEmployee;
    private String department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    public Employee(String surnameEmployee, String nameEmployee, String middlenameEmployee, String department, double salary) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.middlenameEmployee = middlenameEmployee;
        if (isDepartment(department)) {
            this.department = department;
        } else {
            System.out.println("Может такой отдел будет в будущем");
        }
        this.salary = salary;
        count++;
    }

    public static boolean isDepartment(String department) {
        if (department.equals("1") || department.equals("2") || department.equals("3") || department.equals("4") || department.equals("5")) {
            return true;
        }
        return false;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public String getMiddleEmployee() {
        return middlenameEmployee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник № " + id + ", ФИО: " + surnameEmployee + ' ' + nameEmployee + ' ' + middlenameEmployee + ", отдел № " + department + ", зарплата: " + String.format("%.2f", salary) +" руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(nameEmployee, employee.nameEmployee) && Objects.equals(surnameEmployee, employee.surnameEmployee) && Objects.equals(middlenameEmployee, employee.middlenameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee, surnameEmployee, middlenameEmployee, department, salary, id);
    }
}
