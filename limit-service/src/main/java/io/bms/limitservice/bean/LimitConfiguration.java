package io.bms.limitservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Project limit-service
 * @Author s4id23 on 12/03/20
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LimitConfiguration {
  private int maximum;
  private int minimum;

}
