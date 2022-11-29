package pet_shop.application.service;

import pet_shop.application.entity.Comment;
import pet_shop.application.model.request.CreateCommentPostRequest;
import pet_shop.application.model.request.CreateCommentProductRequest;

import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
