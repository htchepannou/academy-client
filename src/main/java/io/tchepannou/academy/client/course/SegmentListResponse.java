package io.tchepannou.academy.client.course;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.SegmentDto;

import java.util.ArrayList;
import java.util.List;

public class SegmentListResponse extends BaseResponse {
    private List<SegmentDto> segments;

    public void add(SegmentDto segment){
        if (segments == null){
            segments = new ArrayList<>();
        }
        segments.add(segment);
    }

    public int getSize(){
        return segments != null ? segments.size() : 0;
    }

    public List<SegmentDto> getSegments() {
        return segments;
    }

    public void setSegments(final List<SegmentDto> segments) {
        this.segments = segments;
    }
}
