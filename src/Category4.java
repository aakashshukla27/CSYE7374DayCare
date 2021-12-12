public class Category4 extends State{
    private int groupSize = 8;
    public Category4(Student student) {
        super(student);
    }

    @Override
    public void setGroup() {

    }

    @Override
    public String getGroup() {
        return null;
    }

    @Override
    public int getGroupSize() {
        return groupSize;
    }

    @Override
    public String ageRangeOfGroup() {
        return "36-47 months. Group size = " + groupSize;
    }
}