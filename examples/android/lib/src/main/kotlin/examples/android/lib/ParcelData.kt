package examples.android.lib

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// Ensure Kotlin Android Extensions plugin has run and generated code correctly
@Parcelize
data class ParcelData(
    val id: String = ""
): Parcelable