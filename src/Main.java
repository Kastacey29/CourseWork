public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Смирнов Василий Павлович", 1, 305280.45);
        employeeBook.addEmployee("Коровин Матвей Михайлович", 3, 127456.23);
        employeeBook.addEmployee("Соловьева Светлана Павловна", 2, 135260.41);
        employeeBook.addEmployee("Котова Марина Евгеньевна", 1, 80234.85);
        employeeBook.addEmployee("Рожков Павел Владимирович", 5, 98542.20);
        employeeBook.addEmployee("Карасева Валентина Васильевна", 3, 147892.45);
        employeeBook.addEmployee("Горшкова Леся Ивановна", 4, 47352.65);
        employeeBook.addEmployee("Павлов Михаил Сергеевич", 4, 246857.00);
        employeeBook.addEmployee("Иванова Мария Владимировна", 3, 85630.00);
        employeeBook.addEmployee("Краснов Сергей Павлович", 2, 176248.12);

        employeeBook.printAllEmployees();
        System.out.println();
        System.out.printf("Общая сумма затрат - %.2f.", employeeBook.calculateSum());
        System.out.println();
        employeeBook.printMinSalary();
        System.out.println();
        employeeBook.printMaxSalary();
        System.out.println();
        System.out.printf("Средняя зарплата = %.2f.", employeeBook.findAverageSum());
        System.out.println();
        employeeBook.printAllFullName();
    }

}