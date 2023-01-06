public class Main {
        public static void main(String[] args) {
            EmployeeBook employeeBook = new EmployeeBook();
             employeeBook.addEmployee(new Employee("Куинджи", "Архип", "Иванович", "3", 83239));
             employeeBook.printAllEmployee();
             employeeBook.printSumSalary();
            System.out.println("Минимальная зарплата у: " +employeeBook.getEmployeeWithMinSalary());
            System.out.println("Максимальная зарплата у: " +employeeBook.getEmployeeWithMaxSalary());
            employeeBook.initialsEmployee();
        }
    }


