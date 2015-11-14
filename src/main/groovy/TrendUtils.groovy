package dj

class TrendUtils {

  def static findTrend(pair) {

    if (null == pair) return null

    if (0 == pair.size()) return null

    if (pair.size() == 1) return 0.0

    calculatePairValue(pair)
  }

  def static calculatePairValue(pair) {
    if (pair[0] == 0.0 && pair[1] > 0.0) return 1.0

    if (pair[0] == pair[1]) return 0.0

    (pair[1] - pair[0])/pair[0]
  }

}
