package com.abbas.ide.ui.common

import android.view.View
import com.google.android.material.snackbar.Snackbar

/** Shows a short snackbar anchored to this view. */
fun View.showSnack(message: String) {
    if (message.isBlank()) return
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()
}
