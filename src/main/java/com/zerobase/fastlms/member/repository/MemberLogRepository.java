package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.entity.MemberLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberLogRepository extends JpaRepository<MemberLog,Long> {
}
