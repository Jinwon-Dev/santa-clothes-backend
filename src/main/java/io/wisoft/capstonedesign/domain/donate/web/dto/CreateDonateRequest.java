package io.wisoft.capstonedesign.domain.donate.web.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateDonateRequest {

    @NotEmpty
    private String title;

    private String image;

    @NotEmpty
    private String text;

    private int view;

    private String tag;

    private Long userId;

    public static CreateDonateRequest newInstance(
            final String title,
            final String image,
            final String text,
            final String tag,
            final Long userId
    ) {
        CreateDonateRequest request = new CreateDonateRequest();
        request.title = title;
        request.image = image;
        request.text = text;
        request.tag = tag;
        request.userId = userId;

        return request;
    }
}
