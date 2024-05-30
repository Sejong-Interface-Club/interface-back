package com.example.ifclubserver.notice.application;

import com.example.ifclubserver.notice.domain.dto.NoticeDto;
import com.example.ifclubserver.notice.domain.dto.request.CreateNoticeRequest;
import com.example.ifclubserver.notice.domain.dto.request.UpdateNoticeRequest;
import com.example.ifclubserver.notice.domain.dto.response.CreateNoticeResponse;

import java.util.List;

public interface NoticeService {

    CreateNoticeResponse createNotice(CreateNoticeRequest form);

    NoticeDto getNotice(Long id);

    List<NoticeDto> getNotices();

    void deleteNotice(Long id);

    NoticeDto updateNotice(Long id, UpdateNoticeRequest request);
}
