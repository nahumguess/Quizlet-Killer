package com.example.quizletkiller

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CardListActivity : AppCompatActivity() {

    // Properties
    private lateinit var deck: Deck // Reference to the deck
    private lateinit var listView: ListView // List view to display the cards
    private lateinit var addButton: Button // Button to add a new card
    private lateinit var shuffleButton: Button // Button to shuffle the cards
    private lateinit var clearButton: Button // Button to clear the cards

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_list) // Assuming you have a layout file named activity_card_list

        // Initialize properties
        deck = Deck() // Or get it from a database, intent extras, etc.
        listView = findViewById(R.id.listView) // Assuming you have a ListView with this id in your layout
        addButton = findViewById(R.id.addButton)
        shuffleButton = findViewById(R.id.shuffleButton)
        clearButton = findViewById(R.id.clearButton)

        // Set up the ListView with an adapter
        // ...

        // Set up button click listeners
        addButton.setOnClickListener {
            onAddCardClicked()
        }
        shuffleButton.setOnClickListener {
            onShuffleClicked()
        }
        clearButton.setOnClickListener {
            onClearClicked()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu
        menuInflater.inflate(R.menu.menu_card_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.some_menu_item -> {
                // Do something
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun onCardClicked() {
        // This method is called when a card is clicked
        // Navigate to card detail view, flip the card, etc.
    }

    private fun onAddCardClicked() {
        // This method is called when the add card button is clicked
        // Navigate to the card creation screen
    }

    private fun onShuffleClicked() {
        // This method is called when the shuffle button is clicked
        // Shuffle the deck and update the ListView
        deck.shuffle()
    }

    private fun onClearClicked() {
        // This method is called when the clear button is clicked
        // Clear the deck and update the ListView
        deck.clear()
    }
}
