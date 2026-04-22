package com.srhdp.springboot4.role.services;

import com.srhdp.springboot4.res.Response;
import com.srhdp.springboot4.role.entity.Role;

import java.util.List;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();

    Response<?> deleteRole(Long id);

}
