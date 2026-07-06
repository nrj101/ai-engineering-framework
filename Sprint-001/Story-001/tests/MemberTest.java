import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void shouldRegisterMemberSuccessfully() {

        Member member = new Member("Alice");

        assertNotNull(member.getMemberId());
        assertEquals("Alice", member.getName());
    }

    @Test
    void shouldRejectBlankMemberName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Member("")
        );
    }

    @Test
    void shouldRejectNullMemberName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Member(null)
        );
    }
}