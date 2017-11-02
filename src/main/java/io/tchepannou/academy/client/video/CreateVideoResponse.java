package io.tchepannou.academy.client.video;

import io.tchepannou.academy.client.dto.VideoDto;

public class CreateVideoResponse extends VideoResponse {
    public CreateVideoResponse() {
    }

    public CreateVideoResponse(final VideoDto video) {
        super(video);
    }
}
