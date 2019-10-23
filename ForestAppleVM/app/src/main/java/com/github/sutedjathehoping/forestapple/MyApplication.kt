package com.github.sutedjathehoping.forestapple

import android.app.Application

class MyApplication: Application() {

    data class Stage(
        val title: String,
        val body: String,
        val actions: List<String>
    )

    companion object {

        val MAIN_MENU = "Main Menu"
        val TRY_AGAIN = "Try Again"



        val scenes: List<Stage> = listOf (
            // 0
            Stage(
                "Introduction",
                "One day, your friend named Alex has a serious illness, and when you ask people around, there's one good witch in the castle that told me, that i have to go to the haunted forest to pick an apple,\n" +
                        "just one apple, but there are 3 different colour apple, Red, Green, and Blue, there're 3 types of apple that is medicine, usual apple, and poisonous apple.",
                actions = listOf(
                    "I'm Understand",
                    "Let's Play",
                    "Cut the Crap and just play."
                )
            ),

            // 1
            Stage(
                "The Haunted Forest",
                "On a cloudy days in the afternoon, you're about to enter the haunted forest gate, but you afraid of the forest because of the story that you have heard but you have to get in and take the apple\n" +
                        "for your lovely best friend, so you have to decide, do you want to take the apple inside the haunted forest, or you just want to go back to your home like a chicken and let your friend die.",
                actions = listOf(
                    "\"I can't do it, I'm afraid, I'm sorry Alex.\"",
                    "\"I don't give a damn about this haunted forest, I have to take those damn apples\"",
                    "\"I'm afraid, but i have to do this, let's go!\""

                )
            ),

            // 2 badEndingChicken
            Stage(
                "It's true that you're a Chicken",
                "Congratulations Chicken, because of your cowardice you let Alex die.",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""

                )
            ),

            // 3
            Stage(
                "The Legendary Tree",
                "This is the tree that the good witch told you, so now, you have to climb the tree and you only can pick 1 apple",
                actions = listOf(
                    "Green Apple",
                    "Red Apple",
                    "Blue Apple",
                    ""
                )
            ),

            // 4 Normal Ending
            Stage(
                "Go to Alex's House",
                "You've picked your apple based on your gut, and after Alex ate the chosen apple, actually it's a normal apple, but it helps Alex but you still have to find" +
                        "the medicine apple, but thank you for your courage and try again to find the medicine apple",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            ),

            // 5 Best Ending
            Stage(
                "Go to Alex's House",
                "You've picked your apple based on your gut, and after Alex ate the chosen apple, and CONGRATULATIONS IT'S THE MEDICINE APPLE, Thank you for your courage because of you, you saved Alex",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            ),

            // 6 Bad Ending
            Stage(
                "Go to Alex's House",
                "You've picked your apple based on your gut, and after Alex ate the chosen apple, sorry to say that it's a poisonous apple, but don\'t be sad at least you've tried and all your effort will be remembered by all of the citizen.",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            )
        )

            // Ending flags
            var badEnding1 = false
        var badEnding2 = false
        var normalEnding1 = false
        var bestEnding = false

        // Utils
        lateinit var currentDisplayedEnding: Stage
    }
}