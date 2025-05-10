import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private int mark;
    private String sname;

    public Student() {
    }

    public Student(int sid, int mark, String sname) {
        this.sid = sid;
        this.mark = mark;
        this.sname = sname;
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", mark=" + mark +
                ", sname='" + sname + '\'' +
                '}';
    }
}
