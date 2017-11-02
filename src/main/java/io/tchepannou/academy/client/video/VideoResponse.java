package io.tchepannou.academy.client.video;

import io.tchepannou.academy.client.BaseResponse;
import io.tchepannou.academy.client.dto.VideoDto;

public class VideoResponse extends BaseResponse {
    private VideoDto video;

    public VideoResponse() {
    }

    public VideoResponse(final VideoDto video) {
        this.video = video;
    }

    public VideoDto getVideo() {
        return video;
    }

    public void setVideo(final VideoDto video) {
        this.video = video;
    }
}
