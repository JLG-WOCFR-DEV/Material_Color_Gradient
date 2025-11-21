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
import io.github.composefluent.component.Tab

@Composable
fun Fluent2NavigationGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    boxPadding: Dp = GalleryContainerDefaults.BoxPadding,
) {
    GalleryContainer(
        title = "Navigation",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(
            title = "Bottom app bar",
            infoUrl = "",
        ) {
            Fluent2BottomAppBar(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Navigation bar",
            infoUrl = "",
        ) {
            Fluent2NavigationBar(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Navigation drawer",
            infoUrl = "",
        ) {
            Fluent2NavigationDrawer(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Navigation rail",
            infoUrl = "",
        ) {
            Fluent2NavigationRail(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Top app bars",
            infoUrl = "",
        ) {
            Fluent2TopAppBars(minWidth, width, boxPadding)
        }

        GalleryContainerChild(
            title = "Tabs",
            infoUrl = "",
        ) {
            Fluent2Tabs(minWidth, width, boxPadding)
        }
    }
}

@Composable
private fun Fluent2TopAppBars(
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
private fun Fluent2NavigationRail(
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
private fun Fluent2NavigationDrawer(
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
private fun Fluent2NavigationBar(
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
private fun Fluent2BottomAppBar(
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
private fun Fluent2Tabs(
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
            Tab(
                items = listOf("Video", "Photo", "Audio"),
                selectedIndex = 0,
                onIndexChange = {}
            )
        }
    }
}
