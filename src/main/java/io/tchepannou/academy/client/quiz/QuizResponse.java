package io.tchepannou.academy.client.quiz;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.QuizDto;

public class QuizResponse extends BaseResponse {
    private QuizDto quiz;

    public QuizDto getQuiz() {
        return quiz;
    }

    public void setQuiz(final QuizDto quiz) {
        this.quiz = quiz;
    }
}
