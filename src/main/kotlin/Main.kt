fun main() {

    webVisit("Home")
    webVisit("About")
    webVisit("location")
    webVisit("offers")
    webVisit("offers")
    webVisit("About")
    webVisit("Offers")
    webVisit("Contact")
    webVisit("Contact")
    webVisit("Location")
    webVisit("offers")
    webVisit("About")
    webVisit("Home")
    webVisit("Home")
    webVisit("Home")
    webVisit("gifts")
    webVisit("History")

    val topVisitedWebpages = getTopVisitedWebpages()
    println("Five most frequently visited web pages:")
    for ((webpage, visits) in topVisitedWebpages) {
        println("$webpage: $visits visits")
    }

}

//
//This variable is used give an store web visits
val webpageVisits = mutableMapOf<String, Int>()

//A function to give updates once someone visits the website.

fun webVisit(webpage: String) {
    val visits = webpageVisits.getOrDefault(webpage, 0)
    webpageVisits[webpage] = visits + 1
}



//.take is used  to state the number of elements one wants and does not print the rest,
// it only prints out the elements asked
fun getTopVisitedWebpages(): List<Pair<String, Int>> {
    return webpageVisits.toList()
        .sortedByDescending { (_, visits) -> visits }
        .take(5)
}


