public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Employee book is full. Adding a new employee is restricted.");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public void printMinSalary() {
        int id = 0;
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника " + employees[id].getFullName() + " составила " + employees[id].getSalary());
    }

    public void printMaxSalary() {
        int id = 0;
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника " + employees[id].getFullName() + " составила " + employees[id].getSalary());
    }

    public double findAverageSum() {
        return calculateSum() / employees.length;
    }

    public void printAllFullName() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }

    }
}
