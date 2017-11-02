package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.CourseDto;

public class CourseResponse extends BaseResponse {
    private CourseDto course;

    public CourseResponse(){

    }
    public CourseResponse(final CourseDto course){
        this.course = course;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(final CourseDto course) {
        this.course = course;
    }
}
