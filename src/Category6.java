public class Category6 extends State{
    private int groupSize = 15;
    public Category6(Student student) {
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
        return "60 months and above. Group size = " + groupSize;
    }
}