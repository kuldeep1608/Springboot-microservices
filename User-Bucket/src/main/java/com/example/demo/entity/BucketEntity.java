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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bucket")
public class BucketEntity {

    @Id
    @Column(name = "item_No")
    private Integer itemNo;
    @Column(name = "product_Id")
    private String productId;
    @Column(name = "user_Id")
    private String userId;
    @Column(name = "quantity")
    private Integer quantity;
}
