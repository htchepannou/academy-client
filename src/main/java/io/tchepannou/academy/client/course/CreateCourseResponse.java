package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.dto.CourseDto;

public class CreateCourseResponse extends CourseResponse {
    public CreateCourseResponse() {
    }

    public CreateCourseResponse(final CourseDto course) {
        super(course);
    }
}
