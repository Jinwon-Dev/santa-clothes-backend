package io.wisoft.capstonedesign.setting.data;

import io.wisoft.capstonedesign.domain.information.web.dto.CreateInformationRequest;

public class DefaultInfoData {

    public static CreateInformationRequest createDefaultInfo(Long userId) {

        return CreateInformationRequest.builder()
                .username("윤진원")
                .phoneNumber("010-0000-0000")
                .userId(userId)
                .build();
    }
}
