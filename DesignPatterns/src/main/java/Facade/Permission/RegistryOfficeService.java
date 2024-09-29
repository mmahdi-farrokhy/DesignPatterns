package Facade.Permission;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RegistryOfficeService {
    private List<String> registeredNationalCodes;

    public boolean query(String nationalCode) {
        return registeredNationalCodes.contains(nationalCode);
    }
}
