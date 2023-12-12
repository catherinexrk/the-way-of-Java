package abstract_;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("工人" + getName() + "工作中");
    }
}
