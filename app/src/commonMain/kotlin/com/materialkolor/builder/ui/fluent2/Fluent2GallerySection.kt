package com.materialkolor.builder.ui.fluent2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.materialkolor.builder.settings.model.Settings
import io.github.composefluent.FluentTheme

@Composable
fun Fluent2GallerySection(
    settings: Settings,
    modifier: Modifier = Modifier,
    defaultExpanded: Boolean = true,
) {
    var actionExpanded by remember { mutableStateOf(defaultExpanded) }
    var textExpanded by remember { mutableStateOf(defaultExpanded) }
    var communicationExpanded by remember { mutableStateOf(defaultExpanded) }
    var containmentExpanded by remember { mutableStateOf(defaultExpanded) }
    var selectionExpanded by remember { mutableStateOf(defaultExpanded) }
    var navigationExpanded by remember { mutableStateOf(defaultExpanded) }

    FluentTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth(),
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = modifier.fillMaxWidth(),
            ) {
                Fluent2ActionGallery(
                    expanded = actionExpanded,
                    toggle = { actionExpanded = it },
                    width = 450.dp,
                )
                Fluent2TextGallery(
                    expanded = textExpanded,
                    toggle = { textExpanded = it },
                    width = 450.dp,
                )
                Fluent2CommunicationGallery(
                    expanded = communicationExpanded,
                    toggle = { communicationExpanded = it },
                )
                Fluent2ContainmentGallery(
                    expanded = containmentExpanded,
                    toggle = { containmentExpanded = it },
                )
                Fluent2SelectionGallery(
                    expanded = selectionExpanded,
                    toggle = { selectionExpanded = it },
                    width = 500.dp,
                )
                Fluent2NavigationGallery(
                    expanded = navigationExpanded,
                    toggle = { navigationExpanded = it },
                )
            }
        }
    }
}
