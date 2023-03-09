package guru.springframework.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class MyUatEnvControllerTest {

  @Autowired
  MyEnvController myEnvController;

  @Test
  void sayWhichEnv() {
    // arrange

    // act
    System.out.println(myEnvController.sayWhichEnv());
    // assert

  }
}