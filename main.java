public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Human human = new Human("John", 25);
        human.sayHello();
    }
}