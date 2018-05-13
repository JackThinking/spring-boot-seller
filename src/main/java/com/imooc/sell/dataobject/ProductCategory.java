package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目（数据库对象，或者叫表映射）
 * Created by Citrix on 2018/5/2.
 */

@Entity//进行与数据库中的字段绑定（一一对应）
@DynamicUpdate//动态更新时间等信息
@Data
public class ProductCategory {

    /*类目id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//这边是个大坑，当时找原因找了好久
    private Integer categoryId;
    /*类目名字*/
    private String  categoryName;
    /*类目编号*/
    private Integer categoryType;

    public Date createTime;

    public Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
