package com.zerobase.fastlms.course.dto;

import com.zerobase.fastlms.course.entity.Banner;
import com.zerobase.fastlms.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {
    Long id;
    String subject;
    String link;
    String states;
    long sortValue;
    boolean usingYn;
    String imagePath;
    LocalDateTime regDt;//등록일(추가날짜)

    String filename;
    String urlFilename;

    //추가컬럼
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .subject(banner.getSubject())
                .link(banner.getLink())
                .imagePath(banner.getImagePath())
                .sortValue(banner.getSortValue())
                .usingYn(banner.isUsingYn())
                .regDt(banner.getRegDt())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .build();
    }

    public static List<BannerDto> of(List<Banner> banners) {
        if (banners == null) {
            return null;
        }
        List<BannerDto> bannerList = new ArrayList<>();
        for(Banner x : banners) {
            bannerList.add(BannerDto.of(x));
        }
        return bannerList;
    }
}
