package me.shkschneider.entities

import android.os.Bundle
import android.os.Parcelable
import androidx.core.os.bundleOf
import kotlinx.android.parcel.Parcelize
import java.util.UUID

private const val ID = "id"
private const val NAME = "name"

@Parcelize
data class Product(
    val id: UUID = UUID.randomUUID(),
    val name: String
) : Parcelable {

    fun toPayload() = payloadOf(
        ID to id,
        NAME to name
    )

    companion object {
        fun fromPayload(payload: Payload) = Product(
            payload.getSerializable(ID) as UUID,
            payload.getString(NAME) as String
        )
    }

}
