package com.zerobase.fastlms.course.model;

import lombok.Data;

@Data
public class BannerInput {
    Long id;
    String subject;
    String link;
    String states;
    int sortValue;
    String contents;
    boolean usingYn;

    //삭제를 위한
    String idList;


    //ADD
    String filename;
    String urlFilename;

}
