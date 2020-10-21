package com.fucct.jpaboard.comment.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest
@Transactional
class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void save() {
        final Comment comment = Comment.builder()
            .build();

        assertThat(commentRepository.save(comment))
            .extracting(Comment::getId)
            .isEqualTo(1L);
    }
}
