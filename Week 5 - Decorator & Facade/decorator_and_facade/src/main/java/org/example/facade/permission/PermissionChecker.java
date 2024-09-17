package org.example.facade.permission;

import java.util.List;

public class PermissionChecker {
    private final List<String> registeredPermissions;

    public PermissionChecker(List<String> registeredPermissions) {
        this.registeredPermissions = registeredPermissions;
    }

    public boolean query(String nationalCode) {
        return registeredPermissions.contains(nationalCode);
    }

}
