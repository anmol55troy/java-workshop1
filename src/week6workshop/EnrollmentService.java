package week6workshop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {

    // Stores enrolled courses for each student
    private Map<String, Set<String>> enrollments = new HashMap<>();

    public boolean enrollStudent(String studentUsername, String courseName) {

        // If student not found, create new record
        enrollments.putIfAbsent(studentUsername, new HashSet<>());

        Set<String> courses = enrollments.get(studentUsername);

        // If already enrolled, return false
        if (courses.contains(courseName)) {
            return false;
        }

        // Enroll student
        courses.add(courseName);
        return true;
    }
}

