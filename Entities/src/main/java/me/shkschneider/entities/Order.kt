package me.shkschneider.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.UUID

@Parcelize
data class Order(
    val id: UUID = UUID.randomUUID(),
    val user: User,
    val product: Product
) : Parcelable
