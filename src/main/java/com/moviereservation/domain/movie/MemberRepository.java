package com.moviereservation.domain.movie;

import com.moviereservation.domain.member.Member;

import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(String id);

    int changePassword(Member member, String newPassword);
}
