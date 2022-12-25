package com.zerobase.fastlms.course.repository;

import com.zerobase.fastlms.course.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {
    List<Banner> findAllByUsingYnIsTrue();
}
