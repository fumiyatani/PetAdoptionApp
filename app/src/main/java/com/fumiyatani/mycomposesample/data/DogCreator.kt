package com.fumiyatani.mycomposesample.data

import com.fumiyatani.mycomposesample.data.pet.Cat
import com.fumiyatani.mycomposesample.data.pet.Dog

private object DogCreator {
    fun createDog(index: Int): Dog {
        return Dog(
            "わんちゃん$index",
            (0..15).random(),
            "とってもいい子なんです。",
            "優しい性格",
            if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
        )
    }
}

interface Pet {
    val name: String
    val age: Int
    val description: String
    val character: String
    val sex: SexType
}

object PetCreator {
    fun createPet(index: Int): Pet {
        return when {
            index % 3 == 0 -> createDog(index)

            index % 4 == 0 -> createCat(index)

            index % 5 == 0 -> createPig(index)

            else -> createOtter(index)
        }
    }
}

private const val DESCRIPTION = "とってもいい子なんです。"
private const val CHARACTER = "優しい性格"
private fun randomAge(): Int {
    return (0..15).random()
}
private fun randomSetType(): SexType {
    return if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
}

private fun createDog(index: Int): Dog {
    return Dog(
        "わんちゃん$index",
        (0..15).random(),
        "とってもいい子なんです。",
        "優しい性格",
        if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
    )
}

private fun createCat(index: Int): Cat {
    return Cat(
        "ねこちゃん$index",
        (0..15).random(),
        "とってもいい子なんです。",
        "優しい性格",
        if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
    )
}

private fun createPig(index: Int): Cat {
    return Cat(
        "ぶたちゃん$index",
        (0..15).random(),
        "とってもいい子なんです。",
        "優しい性格",
        if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
    )
}

private fun createOtter(index: Int): Cat {
    return Cat(
        "かわうそちゃん$index",
        (0..15).random(),
        "とってもいい子なんです。",
        "優しい性格",
        if ((0..1).random() == 0) SexType.MALE else SexType.FEMALE
    )
}