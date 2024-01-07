public class Cat {
    private String name;

    public void say() {
        System.out.println("Мяу");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
