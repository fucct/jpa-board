package com.fucct.jpaboard.member.domain;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.BDDAssertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    void save() {
        final Member member = Member.builder()
            .build();

        assertThat(memberRepository.save(member))
            .extracting(Member::getId)
            .isEqualTo(1L);

    }
}
