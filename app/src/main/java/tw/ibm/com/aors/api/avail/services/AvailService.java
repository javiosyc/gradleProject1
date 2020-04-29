package tw.ibm.com.aors.api.avail.services;


import com.ibm.aors.api.avail.domain.Avail;
import tw.ibm.com.aors.api.avail.dao.redis.AvailDAO;
import tw.ibm.com.aors.api.avail.services.dto.AvailDTO;
import tw.ibm.com.aors.api.avail.repository.AvailRepository;

public class AvailService {
    private AvailRepository repository = new AvailDAO();

    public AvailDTO get() {
        Avail avail = new Avail();
        repository.save(avail);
        return new AvailDTO();
    }
}
