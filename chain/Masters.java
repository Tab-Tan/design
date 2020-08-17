package design.chain;

public class Masters {

    private String name;
    private int age;
    private int level;

    public Masters(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "魂师信息{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 等级=" + level +
                '}';
    }
}
