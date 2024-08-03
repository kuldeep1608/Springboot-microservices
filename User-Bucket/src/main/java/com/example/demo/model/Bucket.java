/**
 *
 */
package com.example.demo.model;

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
public class Bucket {

    private Integer itemNo;
    private String productId;
    private String userid;
    private Integer quantity;
}
