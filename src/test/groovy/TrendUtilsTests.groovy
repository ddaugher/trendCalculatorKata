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

  @Test
  void shouldReturnOneWhenP1EqualsZeroAndP2GreaterThanZero() {
    assert 1.0 == TrendUtils.findTrend([0.0, 1.0])
  }

  @Test
  void shouldReturnZeroWhenP1EqualsP2() {
    assert 0.0 == TrendUtils.findTrend([1.0, 1.0])
  }

  @Test
  void shouldReturnProperValue() {
    assert 1.0 == TrendUtils.findTrend([5.0, 10.0])
  }

  @Test
  void shouldReturnProperValueWhenListOfThreeSupplied() {
    assert 2.0 == TrendUtils.findTrend([0.0, 5.0, 10.0])
  }
}
