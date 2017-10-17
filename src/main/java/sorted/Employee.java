package sorted;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee>{

    private String name;
    private BigDecimal salary;

    public Employee(String name, BigDecimal salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return name.compareTo(e.name);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}
