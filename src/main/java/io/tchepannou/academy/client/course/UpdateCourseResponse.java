package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.dto.CourseDto;

public class UpdateCourseResponse extends CourseResponse {
    public UpdateCourseResponse() {
    }

    public UpdateCourseResponse(final CourseDto course) {
        super(course);
    }
}
