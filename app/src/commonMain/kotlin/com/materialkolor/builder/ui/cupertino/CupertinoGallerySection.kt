package com.materialkolor.builder.ui.cupertino

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
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@Composable
fun CupertinoGallerySection(
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

    CupertinoTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth(),
        ) {
            FlowRow(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = modifier.fillMaxWidth(),
            ) {
                CupertinoActionGallery(
                    expanded = actionExpanded,
                    toggle = { actionExpanded = it },
                    width = 450.dp,
                )
                CupertinoTextGallery(
                    expanded = textExpanded,
                    toggle = { textExpanded = it },
                    width = 450.dp,
                )
                CupertinoCommunicationGallery(
                    expanded = communicationExpanded,
                    toggle = { communicationExpanded = it },
                )
                CupertinoContainmentGallery(
                    expanded = containmentExpanded,
                    toggle = { containmentExpanded = it },
                )
                CupertinoSelectionGallery(
                    expanded = selectionExpanded,
                    toggle = { selectionExpanded = it },
                    width = 500.dp,
                )
                CupertinoNavigationGallery(
                    expanded = navigationExpanded,
                    toggle = { navigationExpanded = it },
                )
            }
        }
    }
}
