package office_hour.oh_20200203_Practice_02_03_2020;
// Practice_02_03_2020: Abstraction Practice
public class Testers extends ScrumTeam {
    /*
    inherited features:
            variables: employeeName, jobTitle, salary
            methods: getEmployeeInfo()
     */
    public Testers(String employeeName, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    @Override
    public void Demo() {
        System.out.println("Tester " + this.employeeName + " is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester " + this.employeeName + " is attending the daily stand up");
    }

    public void foundBug() {
        System.out.println("Tester " + this.employeeName + " reported a bug");
    }


}