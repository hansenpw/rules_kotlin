package examples.android.lib

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelData(
    val id: String = ""
): Parcelable