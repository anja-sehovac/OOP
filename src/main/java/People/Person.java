package People;

class Person {
    private String name;
    private String street;
    private int age;
    private String country;

    public Person(String name, String street){
        this.name=name;
        this.street=street;
        this.age=0;
        this.country="Bosnia and Herzegovina";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.street;



}}




