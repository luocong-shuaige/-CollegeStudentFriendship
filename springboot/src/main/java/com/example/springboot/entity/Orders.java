package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import cn.hutool.core.annotation.Alias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.example.springboot.common.LDTConfig;
import lombok.Getter;
import lombok.Setter;

/**
* <p>
*
* </p>
*
* @author zlw
* @since 2024-02-05
*/
@Getter
@Setter
@ApiModel(value = "Orders对象", description = "")
public class Orders implements Serializable {

private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    // 订单编号
    @ApiModelProperty("订单编号")
    @Alias("订单编号")
    private String code;

    // 商品id
    @ApiModelProperty("商品id")
    @Alias("商品id")
    private Integer goodsId;

    // 数量
    @ApiModelProperty("数量")
    @Alias("数量")
    private Integer num;

    // 换购时间
    @ApiModelProperty("换购时间")
    @Alias("换购时间")
    private String time;

    // 积分
    @ApiModelProperty("积分")
    @Alias("积分")
    private Integer score;

    // 订单id
    @ApiModelProperty("订单id")
    @Alias("订单id")
    private Integer userId;
    // 地址信息
    @ApiModelProperty("地址信息")
    @Alias("地址信息")
    private String address;
}
