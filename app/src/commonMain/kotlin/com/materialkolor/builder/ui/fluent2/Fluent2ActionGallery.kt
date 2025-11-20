package com.materialkolor.builder.ui.fluent2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainer
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainerChild
import com.materialkolor.builder.ui.home.preview.gallery.GalleryContainerDefaults
import io.github.composefluent.ui.FluentButton
import io.github.composefluent.ui.FluentTextButton

@Composable
fun Fluent2ActionGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    itemPadding: Dp = GalleryContainerDefaults.ItemPadding,
) {
    GalleryContainer(
        title = "Actions",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(title = "Common buttons", infoUrl = "") {
            Fluent2CommonButtons(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Floating action buttons", infoUrl = "") {
            Fluent2FloatingActionButtons(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Icon buttons", infoUrl = "") {
            Fluent2IconButtons(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Segmented buttons", infoUrl = "") {
            Fluent2SegmentedButtons(minWidth, width, itemPadding)
        }
    }
}

@Composable
private fun Fluent2SegmentedButtons(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(itemPadding),
        ) {
            Text("N/A")
        }
    }
}

@Composable
private fun Fluent2IconButtons(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(itemPadding),
        ) {
            Text("N/A")
        }
    }
}

@Composable
private fun Fluent2FloatingActionButtons(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(itemPadding),
        ) {
            Text("N/A")
        }
    }
}

@Composable
private fun Fluent2CommonButtons(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .widthIn(minWidth, width)
                .padding(itemPadding),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FluentButton(onClick = {}) {
                    Text("Button")
                }
                FluentTextButton(onClick = {}) {
                    Text("Text Button")
                }
            }
        }
    }
}
