package com.materialkolor.builder.ui.fluent2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.width
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
import io.github.composefluent.ui.FluentCard

@Composable
fun Fluent2ContainmentGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    boxPadding: Dp = GalleryContainerDefaults.BoxPadding,
) {
    GalleryContainer(
        title = "Containment",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(
            title = "Dialog / Bottom Sheet",
            infoUrl = "",
        ) {
            Fluent2DialogsDemo(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Cards",
            infoUrl = "",
        ) {
            Fluent2CardsDemo(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Dividers",
            infoUrl = "",
        ) {
            Fluent2DividersDemo(minWidth, width)
        }
    }
}

@Composable
private fun Fluent2DividersDemo(
    minWidth: Dp,
    width: Dp,
) {
    OutlinedCard {
        Box(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(32.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text("N/A")
        }
    }
}

@Composable
private fun Fluent2DialogsDemo(
    minWidth: Dp,
    width: Dp,
    boxPadding: Dp,
) {
    OutlinedCard {
        Box(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(boxPadding),
            contentAlignment = Alignment.Center,
        ) {
            Text("N/A")
        }
    }
}

@Composable
private fun Fluent2CardsDemo(
    minWidth: Dp,
    width: Dp,
    boxPadding: Dp,
) {
    OutlinedCard {
        Box(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(boxPadding),
            contentAlignment = Alignment.Center,
        ) {
            FluentCard {
                Text("Fluent Card")
            }
        }
    }
}
