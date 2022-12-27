public class EmployeeBook {
    private static Employee [] employees = new Employee[10];{
        employees[0] = new Employee("Крамской", "Иван", "Николаевич", "1", 50733);
        employees[1] = new Employee("Перов", "Василий", "Григорьевич", "2", 53555);
        employees[2] = new Employee("Иванов", "Сергей", "Васильевич", "3", 72981);
        employees[3] = new Employee("Мясоедов", "Григорий", "Григорьевич", "4", 49773);
        employees[4] = new Employee("Маковский", "Владимир", "Егорович", "5", 61342);
        employees[5] = new Employee("Киселёв", "Александр", "Александрович", "1", 84123);
        employees[6] = new Employee("Максимов", "Василий", "Максимович", "2", 49871);
        employees[7] = new Employee("Корзухин", "Алексей", "Иванович", "3", 63453);
        employees[8] = new Employee("Касаткин", "Николай", "Алексеевич", "4", 57424);

    }

    //Добавление работника в массив
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println("Мест нет");
    }

    //Удаление сотрудника с нужными ФИО
    public void removeEmployee(String surnameEmployee, String nameEmployee, String middlenameEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && surnameEmployee.equals(employees[i].getSurnameEmployee())
                    && nameEmployee.equals(employees[i].getNameEmployee())
                    && middlenameEmployee.equals(employees[i].getMiddleEmployee())){
                employees[i] = null;
                return;
            }
        }
        System.out.println("Сотрудника с таким ФИО нет");
    }

    //Вывод списка всех сотрудников
    public void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //Сумма зарплат всех сотрудников
    public double sumSalary() {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    //Вывод суммы зарплат всех сотрудников
    public void printSumSalary() {
        System.out.println("Сумма зарплат всех сотрудников за месяц: " +sumSalary() +" руб.");
        System.out.println("Средняя зарплата за месяц: " +sumSalary()/employees.length +" руб.");
    }

    public int getFirstNotNullSalaryIndex() {
        for (int i = 0; i < employees.length; i++) {
           if (employees[i] != null) {
               return i;
           }
        }
        throw new RuntimeException("Нет ни одного сотрудника");
    }

    //Сотрудник с минимальной зарплатой
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    //Сотрудник с максимальной зарплатой
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public void printAllEmployeeByDepartment(String department) {
        for (Employee employee : employees) {
            if (employee != null && department.equals(employee.getDepartment())) {
                System.out.println(employee);
            }
        }
    }
}
