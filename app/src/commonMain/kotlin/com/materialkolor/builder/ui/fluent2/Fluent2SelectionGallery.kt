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
import io.github.composefluent.component.CalendarView
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.MenuBar
import io.github.composefluent.component.PillButton
import io.github.composefluent.component.RadioButton
import io.github.composefluent.component.Slider

@OptIn(io.github.composefluent.ExperimentalFluentApi::class)
@Composable
fun Fluent2SelectionGallery(
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
            Fluent2CheckboxesDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Chips", infoUrl = "") {
            Fluent2ChipsDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Radio buttons", infoUrl = "") {
            Fluent2RadioButtonsDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Switches", infoUrl = "") {
            Fluent2SwitchesDemo(minWidth, width)
        }
        GalleryContainerChild(title = "Menus", infoUrl = "") {
            Fluent2MenuDemo(minWidth, width)
        }
        GalleryContainerChild(title = "Sliders", infoUrl = "") {
            Fluent2SlidersDemo(minWidth, width)
        }
        GalleryContainerChild(title = "Date picker", infoUrl = "") {
            Fluent2DatePickerDemo(minWidth, width, itemPadding)
        }
        GalleryContainerChild(title = "Time picker", infoUrl = "") {
            Fluent2TimePickerDemo(minWidth, width, itemPadding)
        }
    }
}

@Composable
private fun Fluent2TimePickerDemo(
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
            Text("N/A")
        }
    }
}

@OptIn(io.github.composefluent.ExperimentalFluentApi::class)
@Composable
private fun Fluent2DatePickerDemo(
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
            CalendarView(onChoose = {})
        }
    }
}

@Composable
private fun Fluent2MenuDemo(
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
            MenuBar {
                Text("Menu")
            }
        }
    }
}

@Composable
private fun Fluent2ChipsDemo(
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
            PillButton(
                selected = selected,
                onSelectedChanged = { selected = it }
            ) {
                Text("Chip")
            }
        }
    }
}

@Composable
private fun Fluent2CheckboxesDemo(
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
            CheckBox(
                checked = checked,
                onCheckStateChange = { checked = it },
                label = "Checkbox"
            )
        }
    }
}

@Composable
private fun Fluent2RadioButtonsDemo(
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
            RadioButton(
                selected = selected,
                onClick = { selected = !selected },
                label = "Radio button"
            )
        }
    }
}

@Composable
private fun Fluent2SwitchesDemo(
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
            Text("Switch N/A")
        }
    }
}

@Composable
private fun Fluent2SlidersDemo(
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
            Slider(
                value = value,
                onValueChange = { value = it },
            )
        }
    }
}
