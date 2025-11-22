package com.materialkolor.builder.ui.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoSegmentedControl

@Composable
fun CupertinoCardStub(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .shadow(elevation = 1.dp, shape = RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .padding(16.dp),
        content = content
    )
}

@Composable
fun CupertinoRadioButtonStub(
    selected: Boolean,
    onClick: () -> Unit,
    label: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(8.dp)
    ) {
        if (selected) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = Color(0xFF007AFF), // iOS Blue
                modifier = Modifier.size(24.dp)
            )
        } else {
            Spacer(modifier = Modifier.size(24.dp))
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(label)
    }
}

@Composable
fun CupertinoTabsStub(
    selected: Int,
    onSelected: (Int) -> Unit,
    titles: List<String>
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color.LightGray)
            .padding(2.dp)
    ) {
        titles.forEachIndexed { index, title ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(2.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(if (selected == index) Color.White else Color.Transparent)
                    .clickable { onSelected(index) }
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(title, color = if (selected == index) Color.Black else Color.Gray)
            }
        }
    }
}
