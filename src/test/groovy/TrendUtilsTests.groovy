package com.pillar.battle

import org.junit.Test

class TrendUtilsTests {

  @Test
  void shouldReturnNullWhenSuppliedListIsNull() {
    assert null == TrendUtils.findTrend(null)
  }

  @Test
  void shouldReturnNullWhenSuppliedListIsEmpty() {
    assert null == TrendUtils.findTrend([])
  } 

  @Test
  void shouldReturnZeroWhenSuppliedListOnlyContainsASingleValue() {
    assert 0 == TrendUtils.findTrend([1.0])
  }
}
