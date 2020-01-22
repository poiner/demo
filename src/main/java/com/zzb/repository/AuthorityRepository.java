package com.zzb.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzb.entity.Authority;
import com.zzb.model.AuthorityDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * AuthorityRepository
 *
 * @author maqionggui
 * @date 2020/1/20
 */
@Mapper
public interface AuthorityRepository extends BaseMapper<Authority> {
    List<AuthorityDTO> findAuthorities();
}
