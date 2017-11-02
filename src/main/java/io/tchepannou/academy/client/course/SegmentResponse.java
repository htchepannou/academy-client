package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.SegmentDto;

public class SegmentResponse extends BaseResponse {
    private SegmentDto segment;

    public SegmentResponse() {
    }

    public SegmentResponse(final SegmentDto segment) {
        this.segment = segment;
    }

    public SegmentDto getSegment() {
        return segment;
    }

    public void setSegment(final SegmentDto segment) {
        this.segment = segment;
    }
}
