public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;
    double netSalary;
    double totalSalary;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        if (hireYear <= 2021){
            this.hireYear = hireYear;
        }
    }

    public void tax() {
        if (this.salary > 1000) {
            double tax = this.salary * 0.03;
            netSalary = this.salary - tax;
            System.out.println("Vergi : " + tax+" TL");
        }
    }

    public void bonus() {
        if (this.workHours > 40) {
            double bonusPerHoursPayment = 30.0;
            double bonusHours = this.workHours - 40.0;
            double bonusPayment = bonusHours * bonusPerHoursPayment;
            netSalary += bonusPayment;
            System.out.println("Bonus : " + bonusPayment+" TL");
        }
    }

    public void raiseSalary(){
        double raiseSalary = 0;
        int currentYear = 2021;
        if (currentYear-this.hireYear < 10){
            raiseSalary = this.salary*0.05;
        } else if (currentYear-this.hireYear > 9 && currentYear-this.hireYear < 20) {
            raiseSalary = this.salary*0.10;
        } else if (currentYear-this.hireYear > 19) {
            raiseSalary = this.salary*0.15;
        }
        System.out.println("Maaş Artışı : "+raiseSalary+" TL");
        totalSalary = this.salary + raiseSalary;
    }

    public String toString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary+" TL");
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+netSalary+" TL");
        System.out.println("Toplam Maaş : "+totalSalary+" TL");

        return this.name;
    }
}
