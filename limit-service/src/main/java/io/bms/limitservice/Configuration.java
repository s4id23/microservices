package io.bms.limitservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Project limit-service
 * @Author s4id23 on 12/03/20
 */
@Component
@ConfigurationProperties("limit-service")
@Getter
@Setter
public class Configuration {
  private int minimum;
  private int maximum;

}
