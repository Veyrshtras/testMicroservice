package com.example.paymentsystem.DbInserter;

import com.example.paymentsystem.entity.Permission;
import com.example.paymentsystem.entity.Role;
import com.example.paymentsystem.entity.User;
import com.example.paymentsystem.repository.PermissionRepository;
import com.example.paymentsystem.repository.RoleRepository;
import com.example.paymentsystem.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Component
public class AdminInitializer implements CommandLineRunner {
    private final PermissionRepository permissionRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public AdminInitializer(PermissionRepository permissionRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.permissionRepository = permissionRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Permission reader = new Permission();
        reader.setName("READ_PERMISSION");
        reader.setTitle("READ PERMISSION");
        Permission writer = new Permission();
        writer.setName("WRITE_PERMISSION");
        writer.setTitle("WRITE PERMISSION");

        Permission updater = new Permission();
        updater.setName("UPDATE_PERMISSION");
        updater.setTitle("UPDATE PERMISSION");

        Permission deleter = new Permission();
        deleter.setName("DELETE_PERMISSION");
        deleter.setTitle("DELETE PERMISSION");

        List<Permission> permissionEntityList = new ArrayList<>(Arrays.asList(reader, writer, updater, deleter));
        permissionRepository.saveAll(permissionEntityList);

        Role admin = new Role();
        admin.setName("admin");
        admin.setDescription("Tizimdagi barcha huquqlarga ega bo'lgan role");
        admin.setPermissions(Arrays.asList(reader,writer,updater,deleter));

        roleRepository.save(admin);

        List<User> userList = new ArrayList<>();
        User sys_admin = new User();
        sys_admin.setUsername("user0594");
        sys_admin.setPassword("$2a$10$HBS1D99qTaPcxXFUQCvQZeDbfffskmDsiITvi78.jdl1KgT.n.uD6");
        sys_admin.setRole(Arrays.asList(admin));
        userList.add(sys_admin);
        userRepository.saveAll(userList);

    }
}
