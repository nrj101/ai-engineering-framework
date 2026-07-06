import java.util.Objects;
import java.util.UUID;

public class Member {

    private final UUID memberId;
    private final String name;

    public Member(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Member name cannot be null or blank.");
        }

        this.memberId = UUID.randomUUID();
        this.name = name;
    }

    public UUID getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}