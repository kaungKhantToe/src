public class Person implements Comparable<Person> {
    private String name;
    private char type;

    public Person() {

    }

    public Person(String name, char type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", type=" + type + "]";
    }

    @Override
    public int compareTo(Person o) {
        return toString().compareTo(o.toString());
    }

}
