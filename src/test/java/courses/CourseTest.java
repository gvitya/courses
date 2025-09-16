package courses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourseTest
{
    @Test
    void courseIsFull() {
        var course = new Course("code", "name", 5);
        for (int i = 0; i < 5; i++) {
            course.enroll("applicant" + i);
        }

        assertThrows(IllegalStateException.class, () -> course.enroll("applicant6"));
    }
}
