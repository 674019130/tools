package com.su.mtools.mvc.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Setter
@Getter
@Repository
public class User {
    @NotNull
    public Long id;

    public String userName;

    public String password;

    public Timestamp createTime;

    public Timestamp doneTime;

    public String createUser;
}
