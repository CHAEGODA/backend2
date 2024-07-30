package com.runtobeat.first.repository;

import com.runtobeat.first.entity.DailyRecord;
import com.runtobeat.first.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DailyRecordRepository extends JpaRepository<DailyRecord, Long> {
    DailyRecord findByMemberMemberId(Long memberId);

    List<DailyRecord> findAllByMemberMemberId(Long memberId);

    DailyRecord getByYearMonthDate(LocalDate recordDate);

    Optional<DailyRecord> findByMemberAndYearMonthDate(Member member, LocalDate yearMonthDate);

}
