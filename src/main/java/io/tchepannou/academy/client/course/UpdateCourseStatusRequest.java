package io.tchepannou.academy.client.course;

import javax.validation.constraints.NotNull;

public class UpdateCourseStatusRequest{
    @NotNull
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
