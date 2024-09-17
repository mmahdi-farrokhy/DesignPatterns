package org.example.facade.permission;

public class PermissionRequest {
    private String user;
    private String permission;
    private String nationalCode;

    public PermissionRequest(String user, String permission, String nationalCode) {
        this.user = user;
        this.permission = permission;
        this.nationalCode = nationalCode;
    }

    public String getUser() {
        return user;
    }

    public String getPermission() {
        return permission;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
