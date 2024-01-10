package encap;

/**
 * @author 陶笛
 */
public class Account {
    private String name;
    private double salary;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >2 && name.length() < 6){
            this.name = name;
        } else {
            System.out.println("姓名程度错误");
            return;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0 && salary < 1000000) {
            this.salary = salary;
        } else  {
            System.out.println("薪资输入有误");
            return;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 2 && password.length() < 6){
            this.password = password;
        }
        else {
            System.out.println("长度不合格");
            System.out.println("密码默认设为000000");
            this.password = "000000";
        }
    }

    public void info(){
        System.out.println("个人信息");
    }
}


