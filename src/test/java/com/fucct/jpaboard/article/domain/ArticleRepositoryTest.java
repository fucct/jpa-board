package com.fucct.jpaboard.article.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.fucct.jpaboard.member.domain.Member;

@DataJpaTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void save() {
        final Article article = Article.builder()
            .member(Member.builder().build())
            .comment(Lists.newArrayList())
            .build();

        assertThat(articleRepository.save(article))
            .extracting(Article::getId)
            .isEqualTo(1L);
    }
}
