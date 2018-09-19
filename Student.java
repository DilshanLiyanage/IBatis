public class Student {

    private int id;
    private String fname;
    private String sname;
    private String address;
    private int grade;

    public Student() {
    }

    public Student(int id, String fname, String sname, String address, int grade) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.address = address;
        this.grade = grade;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
