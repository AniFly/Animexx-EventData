// To parse the JSON, install jackson-module-kotlin and do:
//
//   val animexxData = AnimexxData.fromJson(jsonString)

package quicktype

import com.fasterxml.jackson.annotation.*
import com.fasterxml.jackson.core.*
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.node.*
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import com.fasterxml.jackson.module.kotlin.*

val mapper = jacksonObjectMapper().apply {
    propertyNamingStrategy = PropertyNamingStrategy.LOWER_CAMEL_CASE
    setSerializationInclusion(JsonInclude.Include.NON_NULL)
}

data class AnimexxData (
        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val success: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val data: Data
) {
    fun toJson() = mapper.writeValueAsString(this)

    companion object {
        fun fromJson(json: String) = mapper.readValue<AnimexxData>(json)
    }
}

data class Data (
        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val events: List<Event>,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val total: Long
)

data class Event (
        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val id: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val name: String,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val slug: String,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val dateStart: Created,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val dateEnd: Created,

        val address: String? = null,
        val zip: String? = null,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val city: String,

        val state: String? = null,
        val host: String? = null,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val contact: String,

        @get:JsonProperty("isFeatured", required=true)@field:JsonProperty("isFeatured", required=true)
        val isFeatured: Boolean,

        val hashtags: String? = null,

        @get:JsonProperty("isCancelled", required=true)@field:JsonProperty("isCancelled", required=true)
        val isCancelled: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val duration: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val attendees: String,

        val website: String? = null,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val intro: String,

        val mainImage: String? = null,
        val logoImage: Any? = null,

        @get:JsonProperty("isHighlight", required=true)@field:JsonProperty("isHighlight", required=true)
        val isHighlight: Boolean,

        @get:JsonProperty("isPrivate", required=true)@field:JsonProperty("isPrivate", required=true)
        val isPrivate: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val country: String,

        @get:JsonProperty("legacyId", required=true)@field:JsonProperty("legacyId", required=true)
        val legacyID: Long,

        @get:JsonProperty("isAnimexx", required=true)@field:JsonProperty("isAnimexx", required=true)
        val isAnimexx: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val animexx: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val hasGamesroom: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val hasKaraoke: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val hasCatering: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val hasCompetition: Boolean,

        @get:JsonProperty("isPublished", required=true)@field:JsonProperty("isPublished", required=true)
        val isPublished: Boolean,

        @get:JsonProperty("isBanned", required=true)@field:JsonProperty("isBanned", required=true)
        val isBanned: Boolean,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val status: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val created: Created,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val updated: Created,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val geoLat: Double,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val geoLong: Double,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val geoZoom: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val geoType: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val type: Type
)

data class Created (
        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val date: String,

        @get:JsonProperty("timezone_type", required=true)@field:JsonProperty("timezone_type", required=true)
        val timezoneType: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val timezone: String
)

data class Type (
        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val id: Long,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val title: String,

        val description: Any? = null,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val color: String,

        @get:JsonProperty(required=true)@field:JsonProperty(required=true)
        val parent: Long,

        @get:JsonProperty("legacyId", required=true)@field:JsonProperty("legacyId", required=true)
        val legacyID: Long
)
