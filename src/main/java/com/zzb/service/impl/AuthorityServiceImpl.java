package com.zzb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzb.entity.Authority;
import com.zzb.model.AuthorityDTO;
import com.zzb.repository.AuthorityRepository;
import com.zzb.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AuthorityServiceImpl
 *
 * @author maqionggui
 * @date 2020/1/20
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

    private final AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityServiceImpl(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Override
    public List<Authority> findAll() {
        return authorityRepository.selectList(new QueryWrapper<>());
    }

    @Override
    public List<AuthorityDTO> findAuthorities() {
        return authorityRepository.findAuthorities();
    }

    @Override
    public void create(Authority authority) {
        authorityRepository.insert(authority);
    }

    @Override
    public void update(Authority authority) {
        authorityRepository.updateById(authority);
    }

    @Override
    public Authority findById(String id) {
        return authorityRepository.selectById(id);
    }

    @Override
    public void delete(String id) {
        authorityRepository.deleteById(id);
    }
}
