package pet_shop.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pet_shop.application.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

}
