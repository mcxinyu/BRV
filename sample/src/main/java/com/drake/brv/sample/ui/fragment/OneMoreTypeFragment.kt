/*
 * Copyright (C) 2018 Drake, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drake.brv.sample.ui.fragment

import com.drake.brv.sample.R
import com.drake.brv.sample.databinding.FragmentOneMoreTypeBinding
import com.drake.brv.sample.model.OneMoreModel
import com.drake.brv.utils.linear
import com.drake.brv.utils.setup
import com.drake.engine.base.EngineFragment


class OneMoreTypeFragment :
    EngineFragment<FragmentOneMoreTypeBinding>(R.layout.fragment_one_more_type) {

    override fun initView() {
        binding.rv.linear().setup {
            addType<OneMoreModel> {
                when (type) {
                    0 -> R.layout.item_one_more
                    else -> R.layout.item_full_span
                }
            }
        }.models = getData()
    }

    private fun getData(): List<OneMoreModel> {
        return listOf(
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(1),
            OneMoreModel(1),
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(1),
            OneMoreModel(1),
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(1),
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(0),
            OneMoreModel(1),
            OneMoreModel(0),
            OneMoreModel(0)
        )
    }

    override fun initData() {
    }

}
