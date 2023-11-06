package com.example.democompose.domain.util

interface EntityMapper<Entity, DomainModel> {

   fun mapFromEntity(entity: Entity) : DomainModel

   fun mapToEntity(domain: DomainModel) : Entity
}