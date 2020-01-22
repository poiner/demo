package com.zzb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Authority
 *
 * @author maqionggui
 * @date 2020/1/20
 */
@TableName("mt_sys_authority")
@ToString
@Getter
@Setter
public class Authority  implements Serializable,Comparable {

    private Long id;

    private String code;

    private String name;

    private String type;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
