public class Employee {

    private String name;
    private String surname;
    private Double hours;
    private Double rate;


    public Employee(String name, String surname, Double hours, Double rate) {
        this.name = name;
        this.surname = surname;
        this.hours = hours;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getHours() {
        return hours;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public Double calculateSalary() {
        double grossPay = 0;
        if (hours <= 40) {
            grossPay = hours * rate;
        }

        if (hours > 40) {
            grossPay = (hours - 40) * 1.5 * rate + 40 * rate;
        }
        return grossPay;
    }

}

