public class Student {
    private String name;
    private int age;
    private int id;
    private State state;
    public Student(String name, int age, int id){
        this.age = age;
        this.name = name;
        this.id = id;
        if(this.age > 6 && this.age <= 12) this.state = new Category1(this);
        else if(this.age > 12 && this.age <=24) this.state = new Category2(this);
        else if(this.age > 24 && this.age <=35) this.state = new Category3(this);
        else if(this.age > 35 && this.age <=47) this.state = new Category4(this);
        else if(this.age > 47 && this.age <=60) this.state = new Category5(this);
        else if(this.age > 60) this.state = new Category6(this);
    }

    public void incrementState(){
        if(this.age > 6 && this.age <= 12) this.state = new Category1(this);
        else if(this.age > 12 && this.age <=24) this.state = new Category2(this);
        else if(this.age > 24 && this.age <=35) this.state = new Category3(this);
        else if(this.age > 35 && this.age <=47) this.state = new Category4(this);
        else if(this.age > 47 && this.age <=60) this.state = new Category5(this);
        else if(this.age > 60) this.state = new Category6(this);
    }

    public void setAge(int age){
        if(age > this.age){
            this.age = age;
            incrementState();
        }
        else{
            this.age = age;
        }
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.state.ageRangeOfGroup();
    }



}
