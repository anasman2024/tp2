package ma.enset.tp2.service;

import ma.enset.tp2.entities.Role;
import ma.enset.tp2.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
