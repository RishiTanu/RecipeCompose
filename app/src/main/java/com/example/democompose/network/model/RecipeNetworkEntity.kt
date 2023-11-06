package com.example.democompose.network.model

import com.google.gson.annotations.SerializedName

data class RecipeNetworkEntity(

    @SerializedName("pk")
    var pk: Int,

    @SerializedName("title")
    var title: String,

    @SerializedName("publisher")
    var publisher: String,

    @SerializedName("featured_image")
    var featuredImage: String,

    @SerializedName("rating")
    var rating: Int = 0,

    @SerializedName("source_url")
    var sourceUrl: String,

    @SerializedName("description")
    var description: String,
    @SerializedName("cookingInstructions")
    var cookingInstructions: String,

    @SerializedName("ingredients")
    var ingredients: List<String> = emptyList(),

    @SerializedName("date_added")
    var dateAdded: String,

    @SerializedName("date_updated")
    var dateUpdated: String,
)