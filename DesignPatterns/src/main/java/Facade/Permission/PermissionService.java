package Facade.Permission;

public class PermissionService {
    private UserAuthentication userAuthentication;
    private PermissionChecker permissionChecker;
    private RegistryOfficeService registryOfficeService;

    public PermissionService(UserAuthentication userAuthentication, PermissionChecker permissionChecker, RegistryOfficeService registryOfficeService) {
        this.userAuthentication = userAuthentication;
        this.permissionChecker = permissionChecker;
        this.registryOfficeService = registryOfficeService;
    }

    public boolean validate(PermissionRequest permissionRequest) {
        return userAuthentication.query(permissionRequest.getUser()) &&
                permissionChecker.query(permissionRequest.getPermission()) &&
                registryOfficeService.query(permissionRequest.getNationalCode());
    }
}
