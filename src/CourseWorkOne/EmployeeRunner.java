package CourseWorkOne;

import java.util.Arrays;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ермилов Дмитрий Владимирович", 49_876, 1),
                new Employee("Новиков Дмитрий Александрович", 56_264, 2),
                new Employee("Короваев Александр Владимирович", 99_928, 3),
                new Employee("Левченко Станислав Андреевич", 61_911, 4),
                new Employee("Ахметзянов Михаил Ренатович", 89_022, 5)

        };
        getInfoAllEmploy(employees);
        getFullNameEmployee(employees);
        System.out.printf("Минимальная зарплата - %d руб. \n", getMinEmployeeSalary(employees));
        System.out.printf("Максимальная зарплата - %d руб. \n", getMaxEmployeeSalary(employees));
        System.out.printf("Общая сумма зарлпат всех сотрудников %d руб.\n", getAllEmployeeSalary(employees));
        System.out.printf("Среднее колличество зарплат - %.2f руб. \n", getMiddleSalary(employees));
    }

    public static void getInfoAllEmploy(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void getFullNameEmployee(Employee employee[]) {
        for (Employee employee1 : employee) {
            System.out.println(employee1.getFullName());
        }
    }

    public static int getMinEmployeeSalary(Employee employee[]) {
        int min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        }
        return min;
    }

    public static int getMaxEmployeeSalary(Employee employee[]) {
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        }
        return max;
    }

    public static int getAllEmployeeSalary(Employee employee[]) {
        int allSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            allSalary += employee[i].getSalary();
        }
        return allSalary;
    }

    public static double getMiddleSalary(Employee employee[]) {
        double middleSalary = getAllEmployeeSalary(employee) / employee.length;
        return middleSalary;
    }
}

