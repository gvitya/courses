Feature: Limit the enrollments of the courses

  Scenario: Limit the number of enrollments
    Given a course with 5 limit
    And 5 students already enrolled in the course
    When a new student tries to enroll in the course
    Then the enrollment should be successful