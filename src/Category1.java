public class Category1 extends State{
    private int groupSize = 4;
    public Category1(Student student) {
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
        return "6-12 months. Group size = " + groupSize;
    }


}
