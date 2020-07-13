package ru.simbirsoft.warehouse_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.simbirsoft.warehouse_management.model.user.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto  {
     private String username;
     private String email;


     public static UserDto from (User user){
          return UserDto.builder()
                  .username(user.getUsername())
                  .email(user.getEmail())
                  .build();
     }

     public static List<UserDto> from(List<User> users){
          return users.stream().map(UserDto::from).collect(Collectors.toList());
     }

}
