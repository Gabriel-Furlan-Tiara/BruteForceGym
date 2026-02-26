import java.util.ArrayList;
import java.util.List;

public class BruteForce {
    private List<Member> membersDB;
    private List<Exercise> exercisesDB;


    public BruteForce() {
        this.membersDB = new ArrayList<>();
        this.exercisesDB = new ArrayList<>();
    }

    public void registerMember(Member member) {
        this.membersDB.add(member);
    }

    public Member finderById(int id) {
        for (Member member : membersDB) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public Member finderByName(String name) {
        for (Member member : membersDB) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BruteForce{" +
                "registeredUsers=" + membersDB +
                ", exercisesPool=" + exercisesDB +
                '}';
    }
}