package Facade.Permission;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PermissionService {
    private UserAuthentication userAuthentication;
    private PermissionChecker permissionChecker;
    private RegistryOfficeService registryOfficeService;

    public boolean validate(PermissionRequest permissionRequest) {
        return userAuthentication.query(permissionRequest.getUser()) &&
                permissionChecker.query(permissionRequest.getPermission()) &&
                registryOfficeService.query(permissionRequest.getNationalCode());
    }
}
