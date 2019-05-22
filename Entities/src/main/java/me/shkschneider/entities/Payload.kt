package me.shkschneider.entities

import android.os.Bundle
import androidx.core.os.bundleOf

typealias Payload = Bundle

fun payloadOf(vararg pairs: Pair<String, Any?>): Payload = bundleOf(*pairs)
