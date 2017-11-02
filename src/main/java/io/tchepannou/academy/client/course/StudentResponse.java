package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.StudentDto;

public class StudentResponse extends BaseResponse {
    private StudentDto student;

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(final StudentDto student) {
        this.student = student;
    }
}
