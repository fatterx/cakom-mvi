package me.lwn.cakom.android.domain.template

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.lwn.cakom.android.domain.model.XhubEntity

/**
 * Created by fatterx on 2022/4/4
 */

@Composable
fun XhubRectangle(
    width: Dp = XhubStyle.Modifier.width,
    height: Dp = XhubStyle.Modifier.height,
    entity: XhubEntity
) {

    Row {
        Text(
            text = entity.leftText,
            fontSize = XhubStyle.Font.size,
            fontWeight = XhubStyle.Font.weight,
            color = XhubStyle.Font.leftColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(XhubStyle.Modifier.leftBackground)
                .width(width)
                .height(height)
                .wrapContentHeight(),
        )
        Text(
            text = entity.rightText,
            fontSize = XhubStyle.Font.size,
            fontWeight = XhubStyle.Font.weight,
            color = XhubStyle.Font.rightColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(XhubStyle.Modifier.rightBackground)
                .width(width)
                .height(height)
                .wrapContentHeight()
        )

    }
}

object XhubStyle {
    object Font {
        val size = 32.sp
        val weight = FontWeight.Bold
        val leftColor = Color.White
        val rightColor = Color.Black
    }

    object Modifier {
        val width = 100.dp
        val height = 100.dp
        val leftBackground = Color.Black
        val rightBackground = Color(0xfffe9a00)
    }
}