/**
 *
 */
package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfo {

    @NotEmpty
    private String id;
    @NotNull(message = "Name cannot be null")
    private String name;
    private String address;
    @Email(message = "Email should be valid")
    private String email;
}
