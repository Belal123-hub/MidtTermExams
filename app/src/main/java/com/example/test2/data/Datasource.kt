/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.test2.data

import androidx.compose.ui.graphics.Color
import com.example.test2.R
import com.example.test2.model.CardContent


class Datasource() {
    fun loadAffirmations(): List<CardContent> {
        return listOf<CardContent>(
            CardContent(R.string.affirmation1, Color(0xFFFF0000)),
            CardContent(R.string.affirmation2,Color(0xFFFF8A00)),
            CardContent(R.string.affirmation3,Color(0xFFEBFF00)),
            CardContent(R.string.affirmation4,Color(0xFF00FF29)),
            CardContent(R.string.affirmation5,Color(0xFF00F0FF)),
            CardContent(R.string.affirmation6,Color(0xFF1400FF)),
            CardContent(R.string.affirmation7,Color(0xFF9E00FF)),
            )
    }
}
