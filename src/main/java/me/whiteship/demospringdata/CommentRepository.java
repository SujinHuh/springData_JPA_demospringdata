package me.whiteship.demospringdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment,Long>{



    List<Comment> findByCommentContains(String keyword);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCount, Post poste, Pageable pageable);
}
