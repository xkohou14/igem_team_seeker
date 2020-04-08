package igemteam

import com.opencsv.bean.CsvBindByName

open class IgemTeam {
    @CsvBindByName(column = "Team ID ")
    var teamId: Int? = null

    @CsvBindByName(column = " Team ")
    var name: String? = null

    @CsvBindByName(column = " Region ")
    var region: String? = null

    @CsvBindByName(column = " Country ")
    var country: String? = null

    @CsvBindByName(column = " Track ")
    var track: String? = null

    @CsvBindByName(column = " Section ")
    var section: String? = null

    @CsvBindByName(column = " Size ")
    var size: String? = null

    @CsvBindByName(column = " Status ")
    var status: String? = null

    @CsvBindByName(column = " Year")
    var year: String? = null

    val url get() = teamId?.let { "https://igem.org/Team.cgi?team_id=$it" }
}