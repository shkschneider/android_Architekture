package me.shkschneider.architekture

import me.shkschneider.entities.ITrackable

object Tracker {

    fun track(trackable: ITrackable) = trackable.toTrackable()

}
