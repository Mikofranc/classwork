package Comparable;

public class Cat implements Comparable<Cat>{
    private int age;
    private  String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if(this.age > cat.age)return 1;
        else if (this.age == cat.age)
        return 0;
        return -1;
    }
}
