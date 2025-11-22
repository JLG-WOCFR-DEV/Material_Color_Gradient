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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import io.github.composefluent.component.Badge
import io.github.composefluent.component.InfoBar
import io.github.composefluent.component.InfoBarSeverity
import io.github.composefluent.component.ProgressBar
import io.github.composefluent.component.ProgressRing

@Composable
fun Fluent2CommunicationGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    boxPadding: Dp = GalleryContainerDefaults.BoxPadding,
) {
    GalleryContainer(
        title = "Communication",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(
            title = "Badges",
            infoUrl = "",
        ) {
            Fluent2Badges(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Progress indicators",
            infoUrl = "",
        ) {
            Fluent2ProgressIndicators(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Snackbar",
            infoUrl = "",
        ) {
            Fluent2SnackbarButton(minWidth, width, boxPadding)
        }
    }
}

@Composable
private fun Fluent2SnackbarButton(
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
            InfoBar(
                title = { Text("Success") },
                message = { Text("This is an InfoBar") },
                severity = InfoBarSeverity.Success,
            )
        }
    }
}

@Composable
private fun Fluent2Badges(
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
            Badge(backgroundColor = androidx.compose.ui.graphics.Color.Red) { Text("5") }
        }
    }
}

@Composable
private fun Fluent2ProgressIndicators(
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
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                ProgressRing()
                ProgressBar()
            }
        }
    }
}
