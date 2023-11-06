package com.example.democompose.network.model

import com.example.democompose.domain.data.data.Recipe
import com.example.democompose.domain.util.EntityMapper

class ReceipeNetworkMapper : EntityMapper<RecipeNetworkEntity,Recipe>{

    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            title = entity.title,
            featuredImage = entity.featuredImage,
            rating = entity.rating,
            publisher = entity.publisher,
            sourceUrl = entity.sourceUrl,
            description = entity.description,
            cookingInstructions = entity.cookingInstructions,
            ingredients = entity.ingredients,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated,
        )
    }

    override fun mapToEntity(domain: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            pk = domain.id,
            title = domain.title,
            featuredImage = domain.featuredImage,
            rating = domain.rating,
            publisher = domain.publisher,
            sourceUrl = domain.sourceUrl,
            description = domain.description,
            cookingInstructions = domain.cookingInstructions,
            ingredients = domain.ingredients,
            dateAdded = domain.dateAdded,
            dateUpdated = domain.dateUpdated,
        )
    }

    fun fromEntityList(initial : List<RecipeNetworkEntity>) : List<Recipe>{
        return initial.map { mapFromEntity(it) }
    }

    fun  toEnityList(initial: List<Recipe>) : List<RecipeNetworkEntity>{
        return initial.map { mapToEntity(it) }
    }
}