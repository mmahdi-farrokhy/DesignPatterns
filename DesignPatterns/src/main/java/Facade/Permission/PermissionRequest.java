package Facade.Permission;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PermissionRequest {
    private String user;
    private String permission;
    private String nationalCode;
}
