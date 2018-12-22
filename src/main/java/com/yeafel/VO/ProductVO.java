package com.yeafel.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  商品(包含类目)
 * Created by kangyifan on 2018/7/27 9:21
 */
@Data
public class ProductVO  implements Serializable {


    private static final long serialVersionUID = 1301665407825470897L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
