package com.materialkolor.builder.ui.fluent2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainer
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainerChild
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainerDefaults
import io.github.composefluent.ui.FluentTextField

@Composable
fun Fluent2TextGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    itemPadding: Dp = GalleryContainerDefaults.ItemPadding,
) {
    GalleryContainer(
        title = "Text inputs",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(
            title = "Text fields",
            infoUrl = "",
        ) {
            Fluent2TextFields(minWidth, width, itemPadding)
        }
    }
}

@Composable
private fun Fluent2TextFields(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(16.dp),
        ) {
            var text by remember { mutableStateOf("") }
            FluentTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Text Field") },
            )
            var text2 by remember { mutableStateOf("") }
            FluentTextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Outlined Text Field") },
                isError = true,
            )
        }
    }
}
