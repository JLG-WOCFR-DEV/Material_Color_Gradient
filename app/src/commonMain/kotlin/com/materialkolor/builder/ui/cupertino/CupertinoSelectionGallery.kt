package com.materialkolor.builder.ui.cupertino

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
import io.github.alexzhirkevich.cupertino.CupertinoCheckBox
import io.github.alexzhirkevich.cupertino.CupertinoSlider
import io.github.alexzhirkevich.cupertino.CupertinoSwitch

@Composable
fun CupertinoSelectionGallery(
    expanded: Boolean,
    toggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    minWidth: Dp = GalleryContainerDefaults.MinWidth,
    width: Dp = GalleryContainerDefaults.Width,
    itemPadding: Dp = GalleryContainerDefaults.ItemPadding2,
) {
    GalleryContainer(
        title = "Selection",
        expanded = expanded,
        toggle = toggle,
        modifier = modifier,
    ) {
        GalleryContainerChild(title = "Checkboxes", infoUrl = "") {
            CupertinoCheckboxesDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Radio buttons", infoUrl = "") {
            CupertinoRadioButtonsDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Switches", infoUrl = "") {
            CupertinoSwitchesDemo(minWidth, width)
        }
        GalleryContainerChild(title = "Sliders", infoUrl = "") {
            CupertinoSlidersDemo(minWidth, width)
        }
    }
}

@Composable
private fun CupertinoCheckboxesDemo(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(itemPadding),
        ) {
            var checked by remember { mutableStateOf(false) }
            CupertinoCheckBox(
                checked = checked,
                onCheckedChange = { checked = it },
            )
        }
    }
}

@Composable
private fun CupertinoRadioButtonsDemo(
    minWidth: Dp,
    width: Dp,
    itemPadding: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(itemPadding),
        ) {
            var selected by remember { mutableStateOf(false) }
            CupertinoRadioButtonStub(
                selected = selected,
                onClick = { selected = !selected },
                label = "Radio Button"
            )
        }
    }
}

@Composable
private fun CupertinoSwitchesDemo(
    minWidth: Dp,
    width: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(32.dp),
        ) {
            var checked by remember { mutableStateOf(false) }
            CupertinoSwitch(
                checked = checked,
                onCheckedChange = { checked = it },
            )
        }
    }
}

@Composable
private fun CupertinoSlidersDemo(
    minWidth: Dp,
    width: Dp,
) {
    OutlinedCard {
        Column(
            modifier = Modifier
                .requiredWidthIn(minWidth)
                .width(width)
                .padding(32.dp),
        ) {
            var value by remember { mutableStateOf(0.5f) }
            CupertinoSlider(
                value = value,
                onValueChange = { value = it },
            )
        }
    }
}
