import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
    private String cref;
    private List<Member> members;

    public Teacher(int id, String name, String email, String cref, List<Member> members) {
        super(id, name, email);
        this.cref = cref;
        this.members = new ArrayList<>();
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "cref='" + cref + '\'' +
                ", members=" + members +
                '}';
    }
}
