class TrendUtils {

  def static findTrend(list) {

    if (null == list) return null

    if (0 == list.size()) return null

    if (list.size() == 1) return 0.0

    calculatePairValue(list)
  }

  def static calculatePairValue(pair) {
    if (pair[0] == 0.0 && pair[1] > 0.0) return 1.0

    if (pair[0] == pair[1]) return 0.0

    (pair[1] - pair[0])/pair[0]
  }

}
