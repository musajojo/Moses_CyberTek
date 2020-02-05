package office_hour.oh_20200203_Practice_02_03_2020;
// Practice_02_03_2020: Abstraction Practice
public class BOA {

    public static void main(String[] args) {

        BA Mohammed = new BA("Mohammed", 156000);
        // Mohammed.getEmployeeInfo();

        BA Parvin = new BA("Parvin", 145000);

        Testers Sevim = new Testers("Sevim", "QA", 120000);
        Testers Gunel = new Testers("Gunel", "Manual Tester", 110000);
        Testers Serife = new Testers("Serife", "SDET", 115000);

        Testers[] testers = {Sevim, Gunel, Serife};
        BA[] BATeam = {Mohammed, Parvin};

        ScrumTeam[][] scrum = {testers, BATeam};

        for (ScrumTeam[] eachArray : scrum) {
            for (ScrumTeam eachMember : eachArray) {
                eachMember.getEmployeeInfo();
            }

        }


    }
}