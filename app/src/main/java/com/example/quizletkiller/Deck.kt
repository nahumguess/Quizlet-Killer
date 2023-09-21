package com.example.quizletkiller

/**
 * Properties:
 * A list or mutable list to store the cards
 * Optimally, metadata about the deck, such as a title, description, or creation date.
 *
 * Initialization:
 * A constructor or initializer to create an empty deck or initialize it with a predefined set of cards.
 *
 * Basic Operations:
 * Add a card to the deck
 * Remove a card from the deck
 * Shuffle the deck
 * Clear the entire deck
 *
 * Advanced Operations:
 * Search for cards based on their front or back text
 * Sort cards based on criteria such as front or back text, or creation date
 * Filter cards based on criteria
 *
 * Persistence:
 * Methods to save the deck to storage and load it back
 * This can be done in a variety of ways, such as saving the deck to a file, or saving it to a database.
 */

class Deck(val title: String = "Untitled Deck") {

    private val cards: MutableList<Card> = mutableListOf()

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun removeCard(card: Card) {
        cards.remove(card)
    }

    fun getCard(index: Int): Card? {
        return if (index in cards.indices) cards[index] else null
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun clear() {
        cards.clear()
    }

    fun size(): Int {
        return cards.size
    }
}