package com.withplum.emojiapp

import android.app.Activity
import android.view.View
import androidx.annotation.IdRes
import com.withplum.emojibottomsheetdialog.view.recyclerview.unsafeLazy

fun <T : View> Activity.bind(@IdRes idRes: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return unsafeLazy { findViewById<T>(idRes) }
}
