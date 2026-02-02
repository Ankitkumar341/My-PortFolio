package mapper;

import model.dto.reqeust.user.UserCreateRequest;
import model.dto.reqeust.user.UserUpdateRequest;
import model.dto.response.user.UserListResponse;
import model.dto.response.user.UserResponse;
import model.entity.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    uses = {RoleMapper.class},
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {
    
    UserResponse toResponse(User user);
    
    UserListResponse toListResponse(User user);
    
    List<UserResponse> toResponseList(List<User> users);
    List<UserListResponse> toListResponseList(List<User> users);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "hashPassword", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "payments", ignore = true)
    @Mapping(target = "chatMessages", ignore = true)
    @Mapping(target = "pastEmployments", ignore = true)
    @Mapping(target = "uiSettings", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    User toEntity(UserCreateRequest request);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "hashPassword", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "payments", ignore = true)
    @Mapping(target = "chatMessages", ignore = true)
    @Mapping(target = "pastEmployments", ignore = true)
    @Mapping(target = "uiSettings", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntity(UserUpdateRequest request, @MappingTarget User user);
}
