package com.zerobase.fastlms.course.service;

import com.zerobase.fastlms.course.dto.BannerDto;
import com.zerobase.fastlms.course.dto.CourseDto;
import com.zerobase.fastlms.course.model.*;

import java.util.List;

public interface BannerService {

    boolean add(BannerInput parameter);

    boolean set(BannerInput parameter);

    List<BannerDto> list(BannerParam parameter);

    BannerDto getById(long id);

    boolean del(String idList);

}
