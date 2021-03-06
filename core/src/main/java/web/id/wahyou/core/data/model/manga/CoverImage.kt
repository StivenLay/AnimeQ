package web.id.wahyou.core.data.model.manga

import com.google.gson.annotations.SerializedName

data class CoverImage(
    @field:SerializedName("large") val large: String,
    @field:SerializedName("original") val original: String,
    @field:SerializedName("small") val small: String,
    @field:SerializedName("tiny") val tiny: String
)