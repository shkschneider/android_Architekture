package me.shkschneider.entities

import android.os.Bundle
import android.os.Parcelable
import androidx.core.os.bundleOf
import kotlinx.android.parcel.Parcelize
import java.util.UUID

private const val ID = "id"
private const val USER = "user"
private const val PRODUCT = "product"

@Parcelize
data class Order(
    val id: UUID = UUID.randomUUID(),
    val user: User,
    val product: Product
) : Parcelable {

    fun toPayload() = payloadOf(
        ID to id,
        USER to user,
        PRODUCT to product
    )

    companion object {
        @JvmStatic
        fun fromPayload(payload: Payload) = Order(
            payload.getSerializable(ID) as UUID,
            payload.getParcelable(USER) as User,
            payload.getParcelable(PRODUCT) as Product

        )
    }

}
