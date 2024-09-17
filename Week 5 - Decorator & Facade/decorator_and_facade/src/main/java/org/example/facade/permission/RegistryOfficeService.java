package org.example.facade.permission;

import java.util.List;

public class RegistryOfficeService {
    private List<String> registeredNationalCodes;

    public RegistryOfficeService(List<String> registeredNationalCodes) {
        this.registeredNationalCodes = registeredNationalCodes;
    }

    public boolean query(String nationalCode) {
        return registeredNationalCodes.contains(nationalCode);
    }
}
