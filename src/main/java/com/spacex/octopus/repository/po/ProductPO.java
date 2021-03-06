package com.spacex.octopus.repository.po;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "product")
public class ProductPO {
    @Id
    private Long id;
    private Long shopId;
    private String name;
    private Long price;
    private Date createdTime;
    private Date updatedTime;
}
