package me.whiteship.demospringdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PostRpository {

    @Autowired
    EntityManager entityManager;

    public Post add(Post post) {
        entityManager.persist(post);
        return post;
    }

    public void delete(Post post) {
        entityManager.refresh(post);
    }
    public List<Post> findAll() {
         return entityManager.createQuery("SELECT p FROM Post AS p",Post.class).getResultList();
    }


}
