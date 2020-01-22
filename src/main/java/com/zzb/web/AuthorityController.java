package com.zzb.web;

import com.zzb.entity.Authority;
import com.zzb.model.AuthorityDTO;
import com.zzb.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AuthorityController
 *
 * @author maqionggui
 * @date 2020/1/20
 */
@RestController
@RequestMapping("/api/authorities")
public class AuthorityController {
    private final AuthorityService authorityService;

    @Autowired
    public AuthorityController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    @GetMapping("/all")
    public List<Authority> findAll(){
        return authorityService.findAll();
    }

    @GetMapping("/all-with-user")
    public List<AuthorityDTO> findAuthorities() {
        return authorityService.findAuthorities();
    }

    @PostMapping("")
    public void create(Authority authority) {
        authorityService.create(authority);
    }

    @PutMapping("")
    public void update(Authority authority){
        authorityService.update(authority);
    }

    @GetMapping("/{id}")
    public Authority findById(@PathVariable String id) {
        return authorityService.findById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        authorityService.delete(id);
    }
}
