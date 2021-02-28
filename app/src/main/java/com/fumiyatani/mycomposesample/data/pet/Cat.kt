package com.fumiyatani.mycomposesample.data.pet

import com.fumiyatani.mycomposesample.data.Pet
import com.fumiyatani.mycomposesample.data.SexType

data class Cat(
    override val name: String,
    override val age: Int,
    override val description: String,
    override val character: String,
    override val sex: SexType,
) : Pet
