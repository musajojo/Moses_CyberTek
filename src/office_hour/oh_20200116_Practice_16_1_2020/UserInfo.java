package office_hour.oh_20200116_Practice_16_1_2020;
// 	Practice_16_1_2020: Encapsulation
public class UserInfo {

    // Attributes ==> instance variables

    private String userName, // James
            passWord,
            ssn;

    public UserInfo() {   // defaulut values for the instance variables
        setUserName("Unknwon");
        setSSN("000000000");
        setPassWord("123456");
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}