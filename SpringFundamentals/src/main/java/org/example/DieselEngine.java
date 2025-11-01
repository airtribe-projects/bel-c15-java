package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("dieselEngine")
@Primary
public class DieselEngine extends Engine {
  public DieselEngine(@Value("${dieselEngine.enginePower}") String enginePower) {
    super(enginePower);
  }
}
