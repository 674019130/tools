package com.su.mtools.mvc.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Setter
@Getter
@Repository
public class User {
    public Long id;

    public String userName;

    public String password;
}
