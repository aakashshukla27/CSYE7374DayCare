public class Category2 extends State{
    private int groupSize = 5;
    public Category2(Student student) {
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
        return "13-24 months. Group size = " + groupSize;
    }
}
