package company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public  int tax(){
        if (salary<1000){
            return 0;
        }
        if (salary>1000){
            return (int) (salary*0.03);
        }

        return 0;
    }
    public double bonus(){
        if (workHours>40){
            return (workHours-40)*30;
        }else return 0;
    }
    public double raiseSalary(){
        hireYear = 2021-hireYear;
        if (hireYear<10){
            return salary*0.05;
        }if (9< hireYear && hireYear<20){
            return salary*0.1;
        }if (19<hireYear){
            return salary*0.15;
        } return 0;

    }

    public void toString1(){
        System.out.println("ADI: "+name+"Maaşı : "+salary+"\n" +
                "Çalışma Saati :"+workHours+"\n" +
                "Başlangıç Yılı : "+hireYear+"\n" +
                "Vergi : "+tax()+"\n" +
                "Bonus : "+bonus()+"\n" +
                "Maaş Artışı : "+(raiseSalary())+"\n" +
                "Vergi ve Bonuslar ile birlikte maaş : "+(bonus()+salary-tax()) +"\n" +
                "Toplam Maaş : "+(raiseSalary()+bonus()+salary-tax())+"");
    }

}
