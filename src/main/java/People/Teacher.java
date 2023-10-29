package People;

class Teacher extends Person{
    int salary;
    public Teacher(String name, String street, int salary) {
        super(name, street);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return super.getName() + "\n" + super.getStreet() + "\n" + "salary " + this.salary + " euros/month";
    }

}
