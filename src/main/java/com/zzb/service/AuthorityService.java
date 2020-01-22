package com.zzb.service;

import com.zzb.entity.Authority;
import com.zzb.model.AuthorityDTO;

import java.util.List;

/**
 * AuthorityService
 *
 * @author maqionggui
 * @date 2020/1/20
 */
public interface AuthorityService {
    List<Authority> findAll();

    List<AuthorityDTO> findAuthorities();

    void create(Authority authority);

    void update(Authority authority);

    Authority findById(String id);

    void delete(String id);
}
