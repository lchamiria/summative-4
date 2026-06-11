package sum4.model;

public class Member {
    // TODO: Declare private immutable fields
    private String  memberId;
    private String fullName;

    public Member(String memberId, String fullName) {
        // TODO: Implement constructor
        this.memberId = memberId;
        this.fullName = fullName;
    }

    // TODO: Implement getters and toString()


    public String getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return String.format("memberId %s: fullName %s");
    }
}