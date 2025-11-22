package com.materialkolor.builder.ui.cupertino

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CupertinoNavigationGallery(
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
            title = "Tabs",
            infoUrl = "",
        ) {
            CupertinoTabs(minWidth, width, boxPadding)
        }
    }
}

@Composable
private fun CupertinoTabs(
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
            var selected by remember { mutableStateOf(0) }
            CupertinoTabsStub(
                selected = selected,
                onSelected = { selected = it },
                titles = listOf("Video", "Photo", "Audio")
            )
        }
    }
}
