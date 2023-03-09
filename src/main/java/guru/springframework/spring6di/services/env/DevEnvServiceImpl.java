package guru.springframework.spring6di.services.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"-dev", "default"})
@Service("EnvServices")
public class DevEnvServiceImpl implements EnvService {
  @Override
  public String sayEnv() {
    return "This is -dev env service";
  }
}
