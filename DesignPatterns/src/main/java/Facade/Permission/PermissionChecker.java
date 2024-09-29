package Facade.Permission;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PermissionChecker {
    private final List<String> registeredPermissions;

    public boolean query(String nationalCode) {
        return registeredPermissions.contains(nationalCode);
    }

}
