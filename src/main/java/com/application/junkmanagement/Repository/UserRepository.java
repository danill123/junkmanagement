package com.application.junkmanagement.Repository;

import com.application.junkmanagement.dto.UserAddressDto;
import com.application.junkmanagement.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Query("SELECT new com.application.junkmanagement.dto.UserAddressDto(users.id, address.street, address.postalCode) " +
            "FROM Users users INNER JOIN Address address ON address.userId = users.id")
    List<UserAddressDto> getUserAddress();

}
