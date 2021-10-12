package com.su.mtools.mvc.service.impl;

import com.su.mtools.mvc.common.Response;
import com.su.mtools.mvc.entity.User;
import com.su.mtools.mvc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author v-xiameng
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public Response addUser(User user) {
        return new Response(false, "TODO.", 200, null);
    }
}
