package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.LessonDto;

public class LessonResponse extends BaseResponse {
    private LessonDto lesson;

    public LessonResponse() {

    }
    public LessonResponse(final LessonDto lesson) {
        this.lesson = lesson;
    }

    public LessonDto getLesson() {
        return lesson;
    }

    public void setLesson(final LessonDto lesson) {
        this.lesson = lesson;
    }
}
