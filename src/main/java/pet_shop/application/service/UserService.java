package pet_shop.application.service;


import pet_shop.application.entity.User;
import pet_shop.application.model.dto.UserDTO;
import pet_shop.application.model.request.ChangePasswordRequest;
import pet_shop.application.model.request.CreateUserRequest;
import pet_shop.application.model.request.UpdateProfileRequest;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
