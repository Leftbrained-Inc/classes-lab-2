// Example of an abstract class
public abstract class Cat {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public abstract void View();
    public Cat() // constructor without the params
    { age = 0; }
    public Cat(int a)
    {
        age = Math.max(a, 0);
    }
}