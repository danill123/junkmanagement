package com.application.junkmanagement.dto;

//SELECT users.id AS user_id, address.street, address.postal_code FROM users
//INNER JOIN address ON address.user_id = users.id

public class UserAddressDto {
    private Long user_id;
    private String street;
    private String postal_code;

    public UserAddressDto(Long user_id, String street, String postal_code) {
        this.user_id = user_id;
        this.street = street;
        this.postal_code = postal_code;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostal_code() {
        return postal_code;
    }
}
