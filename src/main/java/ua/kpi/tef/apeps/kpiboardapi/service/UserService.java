package ua.kpi.tef.apeps.kpiboardapi.service;

import ua.kpi.tef.apeps.kpiboardapi.entity.Role;
import ua.kpi.tef.apeps.kpiboardapi.entity.User;

import java.util.List;

public interface UserService {
    User register(User user);

    List<User> getAll();

    User findById(Long id);

    User findByUsername(String username);

    User setRole(Role role, Long id);
}
