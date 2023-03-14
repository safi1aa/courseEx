public class Course {
    String university;
    int number;
    String teachersName;
    int startDate;

    public Course(String university,int number,String teachersName,int startDate) {
        this.university = university;
        this.number = number;
        this.teachersName = teachersName;
        this.startDate = startDate;
    }
    public Course(){

    }

    @Override
    public String toString() {
        return "Course\n" +
                "auts: " + university + "\n" +
                " number: "+ number + "\n"+
                "teachersName: " + teachersName + "\n"+
                " startDate: " + startDate;
    }
}

