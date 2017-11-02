package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.dto.CourseDto;

import java.util.List;

public class SearchCourseResponse {
    private List<CourseDto> courses;

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(final List<CourseDto> courses) {
        this.courses = courses;
    }
}
