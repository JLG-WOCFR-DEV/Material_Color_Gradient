package com.materialkolor.builder.ui.home.preview.gallery

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.materialkolor.builder.ui.cupertino.CupertinoActionGallery
import com.materialkolor.builder.ui.cupertino.CupertinoCommunicationGallery
import com.materialkolor.builder.ui.cupertino.CupertinoContainmentGallery
import com.materialkolor.builder.ui.cupertino.CupertinoNavigationGallery
import com.materialkolor.builder.ui.cupertino.CupertinoSelectionGallery
import com.materialkolor.builder.ui.cupertino.CupertinoTextGallery
import com.materialkolor.builder.ui.fluent2.Fluent2ActionGallery
import com.materialkolor.builder.ui.fluent2.Fluent2CommunicationGallery
import com.materialkolor.builder.ui.fluent2.Fluent2ContainmentGallery
import com.materialkolor.builder.ui.fluent2.Fluent2NavigationGallery
import com.materialkolor.builder.ui.fluent2.Fluent2SelectionGallery
import com.materialkolor.builder.ui.fluent2.Fluent2TextGallery
import com.materialkolor.builder.ui.home.DesignSystem
import com.materialkolor.builder.ui.home.preview.gallery.sections.ActionGallery
import com.materialkolor.builder.ui.home.preview.gallery.sections.CommunicationGallery
import com.materialkolor.builder.ui.home.preview.gallery.sections.ContainmentGallery
import com.materialkolor.builder.ui.home.preview.gallery.sections.NavigationGallery
import com.materialkolor.builder.ui.home.preview.gallery.sections.SelectionGallery
import com.materialkolor.builder.ui.home.preview.gallery.sections.TextGallery
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.composefluent.FluentTheme

@Composable
fun GallerySection(
    designSystem: DesignSystem,
    modifier: Modifier = Modifier,
    defaultExpanded: Boolean = true,
    showTitle: Boolean = true,
) {
    var actionExpanded by remember { mutableStateOf(defaultExpanded) }
    var textExpanded by remember { mutableStateOf(defaultExpanded) }
    var communicationExpanded by remember { mutableStateOf(defaultExpanded) }
    var containmentExpanded by remember { mutableStateOf(defaultExpanded) }
    var selectionExpanded by remember { mutableStateOf(defaultExpanded) }
    var navigationExpanded by remember { mutableStateOf(defaultExpanded) }

    val (anyExpanded, allExpanded) = remember(
        actionExpanded,
        textExpanded,
        communicationExpanded,
        containmentExpanded,
        selectionExpanded,
        navigationExpanded,
    ) {
        val list = listOf(
            actionExpanded,
            textExpanded,
            communicationExpanded,
            containmentExpanded,
            selectionExpanded,
            navigationExpanded,
        )

        list.any { it } to list.all { it }
    }

    fun toggleAll(expanded: Boolean) {
        actionExpanded = expanded
        textExpanded = expanded
        communicationExpanded = expanded
        containmentExpanded = expanded
        selectionExpanded = expanded
        navigationExpanded = expanded
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth(),
    ) {
        if (showTitle) {
            Title(
                anyExpanded = anyExpanded,
                allExpanded = allExpanded,
                toggleAll = ::toggleAll,
            )
        }

        FlowRow(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.fillMaxWidth(),
        ) {
            when (designSystem) {
                DesignSystem.MATERIAL_3 -> {
                    ActionGallery(
                        expanded = actionExpanded,
                        toggle = { actionExpanded = it },
                        width = 450.dp,
                    )

                    TextGallery(
                        expanded = textExpanded,
                        toggle = { textExpanded = it },
                        width = 450.dp,
                    )

                    CommunicationGallery(
                        expanded = communicationExpanded,
                        toggle = { communicationExpanded = it },
                    )

                    ContainmentGallery(
                        expanded = containmentExpanded,
                        toggle = { containmentExpanded = it },
                    )

                    SelectionGallery(
                        expanded = selectionExpanded,
                        toggle = { selectionExpanded = it },
                        width = 500.dp,
                    )

                    NavigationGallery(
                        expanded = navigationExpanded,
                        toggle = { navigationExpanded = it },
                    )
                }

                DesignSystem.FLUENT_2 -> {
                    FluentTheme {
                        Fluent2ActionGallery(
                            expanded = actionExpanded,
                            toggle = { actionExpanded = it },
                            width = 450.dp,
                        )
                    }

                    FluentTheme {
                        Fluent2TextGallery(
                            expanded = textExpanded,
                            toggle = { textExpanded = it },
                            width = 450.dp,
                        )
                    }

                    FluentTheme {
                        Fluent2CommunicationGallery(
                            expanded = communicationExpanded,
                            toggle = { communicationExpanded = it },
                        )
                    }

                    FluentTheme {
                        Fluent2ContainmentGallery(
                            expanded = containmentExpanded,
                            toggle = { containmentExpanded = it },
                        )
                    }

                    FluentTheme {
                        Fluent2SelectionGallery(
                            expanded = selectionExpanded,
                            toggle = { selectionExpanded = it },
                            width = 500.dp,
                        )
                    }

                    FluentTheme {
                        Fluent2NavigationGallery(
                            expanded = navigationExpanded,
                            toggle = { navigationExpanded = it },
                        )
                    }
                }

                DesignSystem.IOS -> {
                    CupertinoTheme {
                        CupertinoActionGallery(
                            expanded = actionExpanded,
                            toggle = { actionExpanded = it },
                            width = 450.dp,
                        )
                    }

                    CupertinoTheme {
                        CupertinoTextGallery(
                            expanded = textExpanded,
                            toggle = { textExpanded = it },
                            width = 450.dp,
                        )
                    }

                    CupertinoTheme {
                        CupertinoCommunicationGallery(
                            expanded = communicationExpanded,
                            toggle = { communicationExpanded = it },
                        )
                    }

                    CupertinoTheme {
                        CupertinoContainmentGallery(
                            expanded = containmentExpanded,
                            toggle = { containmentExpanded = it },
                        )
                    }

                    CupertinoTheme {
                        CupertinoSelectionGallery(
                            expanded = selectionExpanded,
                            toggle = { selectionExpanded = it },
                            width = 500.dp,
                        )
                    }

                    CupertinoTheme {
                        CupertinoNavigationGallery(
                            expanded = navigationExpanded,
                            toggle = { navigationExpanded = it },
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun Title(
    anyExpanded: Boolean,
    allExpanded: Boolean,
    toggleAll: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .clickable(
                onClick = {
                    if (anyExpanded && !allExpanded) toggleAll(true)
                    else toggleAll(!anyExpanded)
                },
            )
            .padding(16.dp),
    ) {
        Text(
            text = "Component Gallery",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = FontWeight.Thin,
            ),
        )

        val icon =
            if (anyExpanded) Icons.Default.Visibility
            else Icons.Default.VisibilityOff

        val text = if (anyExpanded) "Collapse all" else "Expand all"
        Icon(imageVector = icon, contentDescription = text)
    }
}
