package ai.andromeda.weather.models

import com.google.gson.annotations.SerializedName

data class Weather(
        @SerializedName("timezone")
        val timeZone: String,
        val current: Current,
        val hourly: List<Hourly>,
        val daily: List<Daily>
)

data class Current(
        val sunrise: Long,
        val sunset: Long,
        val temp: Double,
        val feels_like: Double,
        val temp_min: Double,
        val temp_max: Double,
        val pressure: Double,
        val humidity: Double,
        @SerializedName("dew_point")
        val dewPoint: Double,
        @SerializedName("uvi")
        val uvIndex: Double,
        val visibility: Long,
        @SerializedName("wind_speed")
        val windSpeed: Double,
        @SerializedName("wind_deg")
        val windDegree: Double,
        @SerializedName("weather")
        val status: List<Status>
)

data class Hourly(
        @SerializedName("dt")
        val time: Long,
        val temp: Double,
        val feels_like: Double,
        val temp_min: Double,
        val temp_max: Double,
        val pressure: Double,
        val humidity: Double,
        @SerializedName("dew_point")
        val dewPoint: Double,
        val visibility: Long,
        @SerializedName("wind_speed")
        val windSpeed: Double,
        @SerializedName("wind_deg")
        val windDegree: Double,
        @SerializedName("pop")
        val precipitation: Double,
        @SerializedName("weather")
        val status: List<Status>
)

data class Daily(
        val temp: Temp,
        @SerializedName("weather")
        val status: List<Status>
)

data class Temp(
        val min: Double,
        val max: Double,
        val morn: Double,
        val eve: Double,
        val night: Double
)

data class Status(
        val id: Long,
        @SerializedName("main")
        val condition: String,
        val description: String,
        val icon: String
)