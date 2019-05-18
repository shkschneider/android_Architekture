package me.shkschneider.architekture

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser
import me.shkschneider.entities.ITrackable

object Tracker {

    fun track(trackable: ITrackable): List<String> {
        return when (trackable) {
            is AbstractOrder -> listOf(trackable.id, trackable.user.id, trackable.product.id)
            is AbstractProduct -> listOf(trackable.id)
            is AbstractUser -> listOf(trackable.id)
            else -> listOf(trackable.toTrackable())
        }.map { it.toString() }
    }

}
