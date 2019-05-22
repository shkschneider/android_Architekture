package me.shkschneider.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.UUID

@Parcelize
data class Product(
    val id: UUID = UUID.randomUUID(),
    val name: String
) : Parcelable
