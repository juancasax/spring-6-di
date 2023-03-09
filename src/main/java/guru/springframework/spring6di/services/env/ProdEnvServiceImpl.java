package guru.springframework.spring6di.services.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("EnvServices")
public class ProdEnvServiceImpl implements EnvService {
  @Override
  public String sayEnv() {
    return "This is prod env service";
  }
}
