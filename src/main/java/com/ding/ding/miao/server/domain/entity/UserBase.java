package com.ding.ding.miao.server.domain.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user_base
 * @author 
 */
@Data
public class UserBase implements Serializable {
    /**
     * 用户唯一ID
     */
    private Long id;

    /**
     * 手机号，全局唯一
     */
    private String mobile;

    /**
     * 微信openId全局唯一
     */
    private String openId;

    /**
     * 微信unionId全局唯一
     */
    private String unionId;

    private static final long serialVersionUID = 1L;
}