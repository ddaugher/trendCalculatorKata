package trend

class TrendUtils {

  def static findTrend(list) {

    if (null == list) return null

    if (0 == list.size()) return null

    if (list.size() == 1) return 0.0

    list.collate(2,1,false).collect { pair ->
      calculatePairValue(pair)
    }.sum()
  }

  private static calculatePairValue(pair) {
    if (pair.head() == 0.0 && pair.last() > 0.0) return 1.0

    if (pair.head() == pair.last()) return 0.0

    (pair.last() - pair.head())/pair.head()
  }
}
