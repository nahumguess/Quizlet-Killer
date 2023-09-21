package com.example.quizletkiller

class Card {

    var front: String = ""
        private set

    var back: String = ""
        private set

    fun flipCard() {
        val temp = front
        front = back
        back = temp
    }

    fun editCard(newFront: String, newBack: String) {
        front = newFront
        back = newBack
    }

    fun deleteCard() {
        front = ""
        back = ""
    }


}
