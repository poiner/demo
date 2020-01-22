package com.zzb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * AuthorityDTO
 *
 * @author maqionggui
 * @date 2020/1/21
 */
@Getter
@Setter
public class AuthorityDTO {
    private String id;

    private String code;

    private String name;

    private String type;

    private String createdUser;

    private String lastModifiedUser;

    private Date createdTime;
}
