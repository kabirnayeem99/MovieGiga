package io.kabirnayeem99.moviegiga.data.value_object


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Movie(
    @SerializedName("budget")
    val budget: Int, // 63000000
    @SerializedName("homepage")
    val homepage: String, // http://www.foxmovies.com/movies/fight-club
    @SerializedName("id")
    val id: Int, // 550
    @SerializedName("imdb_id")
    val imdbId: String, // tt0137523
    @SerializedName("original_language")
    val originalLanguage: String, // en
    @SerializedName("original_title")
    val originalTitle: String, // Fight Club
    @SerializedName("overview")
    val overview: String, // A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground "fight clubs" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.
    @SerializedName("popularity")
    val popularity: Double, // 38.977
    @SerializedName("poster_path")
    val posterPath: String, // /bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg
    @SerializedName("release_date")
    val releaseDate: String, // 1999-10-15
    @SerializedName("revenue")
    val revenue: Int, // 100853753
    @SerializedName("runtime")
    val runtime: Int, // 139
    @SerializedName("tagline")
    val tagline: String, // Mischief. Mayhem. Soap.
    @SerializedName("title")
    val title: String, // Fight Club
    @SerializedName("vote_average")
    val rating: Double // 8.4
)