/**
 *
 */
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Kuldeep Singh Yadav
 *
 */
@Entity
@Table(name = "userinfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfoEntity {

    @Id
    @Column(name = "id", unique = true)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "email", unique = true)
    private String email;

}
