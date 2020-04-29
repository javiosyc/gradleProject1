package tw.ibm.com.aors.api.avail.controller;

import tw.ibm.com.aors.api.avail.services.AvailService;
import tw.ibm.com.aors.api.avail.services.dto.AvailDTO;

public class AvailController {

    private final AvailService service = new AvailService();

    public AvailDTO get() {
        return service.get();
    }
}
