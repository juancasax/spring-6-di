package guru.springframework.spring6di.services.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("EnvServices")
public class UatEnvServiceImpl implements EnvService {
  @Override
  public String sayEnv() {
    return "This is uat env service";
  }
}
